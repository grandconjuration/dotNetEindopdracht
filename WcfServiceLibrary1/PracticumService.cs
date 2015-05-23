using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace WcfServiceLibrary1
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "Service1" in both code and config file together.
    public class PracticumService : IPracticumService
    {
netpracticumEntities dbContext = new netpracticumEntities();

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
                Console.WriteLine(ex.Message);
            }
            return false;
        }
    }
}
