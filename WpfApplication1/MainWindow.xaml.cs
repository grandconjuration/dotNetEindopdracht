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
using System.Windows.Navigation;
using System.Windows.Shapes;
using WpfApplication1.localhost;

namespace WpfApplication1
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private PracticumService Webservice = null;
        private Window RegisterWindow = null;

        public MainWindow()
        {
            InitializeComponent();
            Webservice = new PracticumService();
            TextBox u = (TextBox)MainWindowLayoutRoot.FindName("usernameTextbox");
            u.Focus();
            RegisterWindow = new RegisterWindow();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            TextBox u = (TextBox) MainWindowLayoutRoot.FindName("usernameTextbox");
            PasswordBox p = (PasswordBox)MainWindowLayoutRoot.FindName("passwordTextbox");
            string username = u.Text;
            string password = p.Password;

            bool result = Webservice.LogIn(username, password);

            if (result == false)
            {
                Label f = (Label) MainWindowLayoutRoot.FindName("FeedbackLabel");
                f.Content = "Inloggen mislukt! Try again...";
            }
            else
            {
                Debug.WriteLine("Login succesvol");
                Window win = new StoreWindow(u.Text, p.Password);
                if (RegisterWindow.IsVisible)
                {
                    RegisterWindow.Close();
                }
                this.Close();
                win.Show();
            }
        }

        private void RegisterButton_Click(object sender, RoutedEventArgs e)
        {
            RegisterWindow.Show();
        }
    }
}
