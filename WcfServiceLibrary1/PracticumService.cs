using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using System.Web.Script.Services;

namespace WcfServiceLibrary1
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "Service1" in both code and config file together.
    [DataContract] 
    public class PracticumService : IPracticumService
    {
        netpracticumEntities dbContext = new netpracticumEntities();

        public PracticumService()
        {
            dbContext.Configuration.ProxyCreationEnabled = false; 
        }

        public string Register(string givenUsername)
        {
            char[] passwordCharArray = givenUsername.ToCharArray();
            Array.Reverse(passwordCharArray);
            string strPassword = new string(passwordCharArray);

            user newUser = new user();
            newUser.username = givenUsername;
            newUser.password = strPassword;
            newUser.saldo = 100;

            dbContext.users.Add(newUser);
            dbContext.SaveChanges();
            
            user u = dbContext.users.Find(4);
            Debug.WriteLine(u.username);

            return strPassword;
        }

        public bool LogIn(string username, string password)
        {
            try
            {
                user user = (from u in dbContext.users
                             where u.username == username && u.password == password
                             select u).FirstOrDefault();
                Debug.WriteLine("username: " + user.username + ", password: " + user.password);
                return true;
            }
            catch (Exception ex)
            {
                Debug.WriteLine(ex.Message);
            }
            return false;
        }

        public List<producten> getProducts()
        {
            try
            {
                List<producten> products = (from p in dbContext.productens
                                            where p.aantal > 0
                                            select p).ToList();
                return products;
            }
            catch (Exception ex)
            {
                Debug.WriteLine(ex.Message);
                return null;
            }
        }

        public string Buy(int userId, int productId, int volume)
        {
            try
            {
                // check if the user has enough credit
                user user = (from u in dbContext.users
                            where u.id == userId
                            select u).FirstOrDefault();
                double? userCredit = user.saldo;
    
                producten product = (from p in dbContext.productens
                                    where p.id == productId
                                    select p).FirstOrDefault();
                double? productPrice = product.prijs;
    
                int buyingVolume = volume;
    
                double? totalAmount = productPrice * buyingVolume;
    
                // check if there is enough in stock
                if(buyingVolume > product.aantal)
                {
                    return "Er zijn maar " + product.aantal + " stuks in voorraad";
                }
                if(totalAmount > userCredit)
                {
                    return "U heeft niet genoeg krediet! U heeft " + totalAmount + " euro nodig, maar heeft " + userCredit + "euro.";
                }

                // update product data
                product.aantal = product.aantal - buyingVolume;
                dbContext.Entry(product).State = System.Data.Entity.EntityState.Modified;

                // update user credit
                user.saldo = user.saldo - totalAmount;
                dbContext.Entry(user).State = System.Data.Entity.EntityState.Modified;

                // add new record of transaction
                usersproducten userProduct = new usersproducten();
                userProduct.userid = userId;
                userProduct.productid = productId;
                userProduct.aantal = volume;

                dbContext.usersproductens.Add(userProduct);

                // save it all
                dbContext.SaveChanges();

                return "Succesvolle transactie! Transactie informatie: Gebruiker: " + userProduct.userid + "; Product: " + userProduct.productid + "; aantal: " + userProduct.aantal + ";";
            }
            catch (Exception ex)
            {
                Debug.WriteLine(ex.Message);
                return "Er ging iets mis: " + ex.Message;
            }
        }
    }
}
