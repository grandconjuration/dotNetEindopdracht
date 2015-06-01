package client;

import java.util.List;
import java.util.ArrayList;
import org.tempuri.*;
import ui.PracticumClientUI;

public class Client {
    static PracticumService practicumService = new PracticumService();
    static IPracticumService proxy = practicumService.getBasicHttpBindingIPracticumService();
    
    String username = "";
    char[] password = new char[0];
    
    public static void main(String[] args) {
        PracticumClientUI ui = new PracticumClientUI();
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
    
    public boolean logIn(String username, char[] password) {
        if (username == null || username.equals("")) {
            return false;
        }
        else if (password == null || password.length == 0 ) {
            return false;
        }
        
        if (proxy.logIn(username, String.valueOf(password))) {
            this.username = username;
            this.password = password;
            return true;
        }
        return false;
    }
    
    public String register(String username) {
        if (username == null || username.equals("")) {
            return "U heeft geen gebruikersnaam ingevuld.";
        }
        return proxy.register(username);
    }
    
    public List<String[]> getProducts() {
        ArrayOfProducten productArray = proxy.getProducts(this.username, String.valueOf(this.password));
        //List<Producten> productList = productArray.getProducten();
        List<String[]> productList = new ArrayList<>();
        
        for (Producten p : productArray.getProducten()) {
            String[] sArray = new String[4];
            sArray[0] = "" + p.getId();
            sArray[1] = "" + p.getNaam();
            sArray[2] = "" + p.getPrijs();
            sArray[3] = "" + p.getAantal();
            productList.add(sArray);
        }
        
        return productList;
    }
    
    public String buyProduct(int purchaseSelected, int purchaseAmount) {
        return proxy.buyProduct(this.username, String.valueOf(this.password), purchaseSelected, purchaseAmount);
    }
    
    public List<String[]> getPurchases() {
        ArrayOfUserProductDTO purchaseArray = proxy.getPurchases(this.username, String.valueOf(this.password));
        List<String[]> purchaseList = new ArrayList<>();
        
        for (UserProductDTO up : purchaseArray.getUserProductDTO()) {
            String[] sArray = new String[4];
            sArray[0] = "" + up.getId();
            sArray[1] = "" + up.getProductid();
            sArray[2] = "" + up.getUserid();
            sArray[3] = "" + up.getAantal();
            purchaseList.add(sArray);
        }
        
        return purchaseList;
    }
    
    public double getSaldo() {
        double saldo = proxy.getSaldo(this.username, String.valueOf(this.password));
        return saldo;
    }
    
    

}
