package client;

import java.util.List;
import com.microsoft.schemas._2003._10.serialization.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.datacontract.schemas._2004._07.wcfservicelibrary1.*;
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
        ArrayOfproducten productArray = proxy.getProducts(this.username, String.valueOf(this.password));
        //List<Producten> productList = productArray.getProducten();
        List<String[]> productList = new ArrayList<>();
        
        for (Producten p : productArray.getProducten()) {
            String[] sArray = new String[4];
            sArray[0] = "" + p.getId();
            sArray[1] = "" + p.getNaam().getValue();
            sArray[2] = "" + p.getPrijs();
            sArray[3] = "" + p.getAantal();
            productList.add(sArray);
        }
        
        return productList;
    }

}
