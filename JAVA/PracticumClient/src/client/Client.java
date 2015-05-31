package client;

import java.util.List;

import com.microsoft.schemas._2003._10.serialization.*;
import org.datacontract.schemas._2004._07.wcfservicelibrary1.*;
import org.tempuri.*;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hier de namen van alle producten in de winkel:");
		
		PracticumService practicumService = new PracticumService();
		IPracticumService proxy = practicumService.getBasicHttpBindingIPracticumService();
		
		ArrayOfproducten productArray = proxy.getProducts("Nawid", "diwaN");
		List<Producten> productList = productArray.getProducten();
		
		for (Producten p : productList) {
			System.out.println("Naam: " + p.getNaam().getValue());
		}
	}

}
