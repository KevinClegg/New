package Model;

import java.util.ArrayList;

public class ShopAdresseListe {
	
	private ArrayList<ShopAdresse>Adresse;

	public ShopAdresseListe() {
		
		Adresse = new ArrayList<ShopAdresse>();
	}
	
	
	
	
	public void addAdress(ShopAdresse AdressZeile) {
		Adresse.add(AdressZeile);
	}
	
	public void ListeLeeren (ArrayList <ShopAdresse>Adresse) {
		
		
		while(Adresse.size() > 0) {
			  Adresse.remove(0);
			}
	}
	
	
	
	
	
	

	public ArrayList<ShopAdresse> getWare() {
		return Adresse;
	}

	public void setWare(ArrayList<ShopAdresse> adresse) {
		this.Adresse = adresse;
	}
	
	

}
