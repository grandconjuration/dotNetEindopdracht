using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

namespace WcfServiceLibrary1
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "IService1" in both code and config file together.
    [ServiceContract]
    public interface IPracticumService
    {
        [OperationContract]
        string Register(string username);

        [OperationContract]
        bool LogIn(string username, string password);

        [OperationContract]
        List<producten> getProducts();

        [OperationContract]
        string BuyProduct(int userId, int productId, int volume);

        [OperationContract]
        List<usersproducten> GetPurchases(int userId);

        [OperationContract]
        double? GetSaldo(int userId);
    }
}
