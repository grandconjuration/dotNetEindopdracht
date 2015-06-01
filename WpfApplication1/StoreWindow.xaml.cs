using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;
using WpfApplication1.localhost;

namespace WpfApplication1
{
    /// <summary>
    /// Interaction logic for Window1.xaml
    /// </summary>
    public partial class StoreWindow : Window
    {
        private PracticumService Webservice = null;
        private string username;
        private string password;

        public StoreWindow(string u, string p)
        {
            InitializeComponent();
            Webservice = new PracticumService();
            Label l = (Label)StoreWindowLayoutRoot.FindName("usernameLabel");
            username = u;
            password = p;
            l.Content = u;

            this.refresh();
            
        }

        private void refresh()
        {
            ListBox productsListbox = (ListBox)StoreWindowLayoutRoot.FindName("productsListBox");
            productsListbox.Items.Clear();

            ListBox inventoryListBox = (ListBox)StoreWindowLayoutRoot.FindName("inventoryListBox");
            inventoryListBox.Items.Clear();

            this.loadSaldo();
            this.loadProductsList();
            this.loadInventoryList();
        }

        private void loadSaldo()
        {
            double? saldo = Webservice.GetSaldo(username, password);

            Label l2 = (Label)StoreWindowLayoutRoot.FindName("saldoAmountLabel");
            l2.Content = "€" + saldo.ToString();
        }

        private void loadProductsList()
        {
            producten[] products = Webservice.getProducts(username, password);

            ListBox productsListbox = (ListBox)StoreWindowLayoutRoot.FindName("productsListBox");
            foreach (producten pr in products)
            {
                ListBoxItem listboxItem = new ListBoxItem();

                KeyValue kv = new KeyValue();
                kv.key = pr.id.ToString();
                kv.value = pr.naam + ": €" + pr.prijs + " (" + pr.aantal + " stuks in voorraad)";
                productsListbox.Items.Add(kv);
            }
        }

        private void loadInventoryList()
        {
            UserProductDTO[] inventory = Webservice.GetPurchases(username, password);
            ListBox inventoryListBox = (ListBox)StoreWindowLayoutRoot.FindName("inventoryListBox");

            List<UserProductDTO> uniqueList = new List<UserProductDTO>();

            foreach (UserProductDTO upr in inventory)
            {
                UserProductDTO match = uniqueList.Where(x => x.productid == upr.productid).FirstOrDefault();
                if (match == null)
                {
                    uniqueList.Add(upr);
                }
                else
                {
                    uniqueList.First(x => x.productid == upr.productid).aantal += upr.aantal;
                    Debug.WriteLine(uniqueList.First(x => x.productid == upr.productid).aantal);
                }
            }

            foreach (UserProductDTO up in uniqueList)
            {
                ListBoxItem listboxItem = new ListBoxItem();
                listboxItem.Content = up.productNaam + " " + up.aantal;
                inventoryListBox.Items.Add(listboxItem);
            }
        }

        private void productsListBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
        }

        private void BuyButton_Click(object sender, RoutedEventArgs e)
        {
            ListBox productsListBox = (ListBox)StoreWindowLayoutRoot.FindName("productsListBox");
            if ((KeyValue)productsListBox.SelectedItem != null)
            {
                KeyValue kv = (KeyValue)productsListBox.SelectedItem;
                Debug.WriteLine(kv.key);

                TextBox volumeTextBox = (TextBox)StoreWindowLayoutRoot.FindName("volumeTextbox");

                int n;
                bool isNumeric = int.TryParse(volumeTextbox.Text, out n);
                if (!isNumeric)
                {
                    MessageBoxResult result = MessageBox.Show("Heeft a.u.b een geldige hoeveelheid op", "Ok");
                    return;
                }
                else
                {
                    String returnvalue = Webservice.BuyProduct(username, password, int.Parse(kv.key), n);
                    MessageBoxResult result = MessageBox.Show(returnvalue, "Ok");
                    this.refresh();
                }
            }
        }

        private void RefreshButton_Click(object sender, RoutedEventArgs e)
        {
            Debug.WriteLine("test");
            this.refresh();
        }
    }
}
