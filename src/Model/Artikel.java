package Model;

public class Artikel {
	private int Menge;
	private String Name;
	private int Preis;
	
	
	public int getMenge() {
		return Menge;
	}
	public void setMenge(int menge) {
		Menge = menge;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPreis() {
		return Preis;
	}
	public void setPreis(int preis) {
		Preis = preis;
	}
	
	
	@Override
	public String toString() {
		return "Artikel [Menge=" + Menge + ", Name=" + Name + ", Preis=" + Preis + ", getMenge()=" + getMenge()
				+ ", getName()=" + getName() + ", getPreis()=" + getPreis() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
