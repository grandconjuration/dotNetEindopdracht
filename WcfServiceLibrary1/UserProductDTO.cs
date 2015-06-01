using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WcfServiceLibrary1
{
    public class UserProductDTO
    {
        public int id { get; set; }
        public int userid { get; set; }
        public int productid { get; set; }
        public int aantal { get; set; }

        public string productNaam { get; set; }

      /*  public producten producten { get; set; }
        public user user { get; set; }*/
    }
}
