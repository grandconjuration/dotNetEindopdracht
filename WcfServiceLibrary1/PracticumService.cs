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
    public class PracticumService : IPracticumService
    {
        netpracticumEntities dbContext = new netpracticumEntities();

        public PracticumService()
        {
            dbContext.Configuration.ProxyCreationEnabled = false; 
        }

        public string Register(string givenUsername)
        {
            var user = (from u in dbContext.users
                            where u.username == givenUsername
                            select u).FirstOrDefault();

            if (user == null) {
                char[] passwordCharArray = givenUsername.ToCharArray();
                Array.Reverse(passwordCharArray);
                string strPassword = new string(passwordCharArray);

                user newUser = new user();
                newUser.username = givenUsername;
                newUser.password = strPassword;
                newUser.saldo = 100;

                dbContext.users.Add(newUser);
                dbContext.SaveChanges();

                return "Succesvol geregistreerd! Uw wachtwoord is: " + strPassword;
            }
            else {
                return "Deze gebruikernaam is al in gebruik. Kies een andere gebruikersnaam.";
            }
        }

        // TO DO: Check if user exists, THEN return true
        public bool LogIn(string username, string password)
        {
            try
            {
                var user = (from u in dbContext.users
                             where u.username == username && u.password == password
                             select u).FirstOrDefault();

                if (user != null)
                {
                    //Debug.WriteLine("DEBUG: username: " + user.username + ", password: " + user.password);
                    return true;
                }
                else
                {
                    Debug.WriteLine("U bent niet ingelogd!");
                    return false;
                }
            }
            catch (Exception ex)
            {
                Debug.WriteLine(ex.Message);
            }
            return false;
        }

        public List<producten> getProducts(string username, string password)
        {
            if (!LogIn(username, password)) {
                return null;
            }

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

        public string BuyProduct(string username, string password, int userId, int productId, int volume)
        {
            if (!LogIn(username, password))
            {
                return null;
            }

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
                if(product.aantal == 0)
                {
                    return "Dit product is niet meer op voorraad.";
                }
                if(buyingVolume > product.aantal)
                {
                    return "Er zijn maar " + product.aantal + " stuks in voorraad";
                }
                if((double) totalAmount > (double) userCredit)
                {
                    return "U heeft niet genoeg krediet! U heeft " + totalAmount + " euro nodig, maar heeft " + userCredit + " euro.";
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
                return null;
            }
        }

        public List<usersproducten> GetPurchases(string username, string password, int userId)
        {
            if (!LogIn(username, password))
            {
                return null;
            }

            try
            {
                // Get the usersproducten of the user
                List<usersproducten> usersproductens = (from up in dbContext.usersproductens
                                                        where up.userid == userId
                                                        /*
                                                        join p in dbContext.productens on up.productid equals p.id
                                                        select new usersproducten {
                                                            id = up.id,
                                                            userid = up.userid,
                                                            productid = up.productid,
                                                            aantal = up.aantal,
                                                            producten = p
                                                        } */
                                                        select up
                                                        ).ToList();

                return usersproductens;

                // Fill the "usersproducten" with their respective "producten"
                /*
                List<usersproducten> purchases = new List<usersproducten>();
                if (usersproductens.Count() > 0)
                {
                    foreach (usersproducten up in usersproductens) {
                        usersproducten upFilled = up;
                        upFilled.producten = (from p in dbContext.productens
                                              where p.id == up.productid
                                              select p).FirstOrDefault();
                        purchases.Add(upFilled);
                    }
                }
                else
                {
                    Debug.WriteLine("DEBUG: Deze gebruiker heeft nog niets gekocht.");
                    return null;
                }

                return purchases;
                */
            }
            catch (Exception ex)
            {
                Debug.WriteLine(ex.Message);
                return null;
            }
        }

        public double? GetSaldo(string username, string password, int userId)
        {
            if (!LogIn(username, password))
            {
                return null;
            }

            try
            {
                double? saldo = (from u in dbContext.users
                                 where u.id == userId
                                 select u.saldo).FirstOrDefault();
                return saldo;
            }
            catch (Exception ex)
            {
                Debug.WriteLine(ex.Message);
                return null;
            }
        }
    }
}
