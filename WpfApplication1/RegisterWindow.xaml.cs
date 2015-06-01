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
    public partial class RegisterWindow : Window
    {
        private PracticumService Webservice = null;

        public RegisterWindow()
        {
            InitializeComponent();
            Webservice = new PracticumService();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            TextBox u = (TextBox) RegisterWindowLayoutRoot.FindName("usernameTextbox");
            string result = Webservice.Register(u.Text);
            TextBox tb = (TextBox)RegisterWindowLayoutRoot.FindName("FeedbackTextblock");
            tb.Text = result;
        }
    }
}
