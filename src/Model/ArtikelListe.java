package Model;

import java.util.ArrayList;

public class ArtikelListe {
	
	private ArrayList<Artikel>Ware;

	public ArtikelListe() {
		
		Ware = new ArrayList<Artikel>();
	}
	
	
	public void addArtikel(Artikel NeuerArtikel){
		Ware.add(NeuerArtikel);
	}
	
	public void ListeLeeren (ArrayList<Artikel> Ware) {
		
		
		while(Ware.size() > 0) {
			  Ware.remove(0);
			}
	}
	
	
	

	public ArrayList<Artikel> getWare() {
		return Ware;
	}

	public void setWare(ArrayList<Artikel> ware) {
		this.Ware = ware;
	}
	
	
	
	

}
