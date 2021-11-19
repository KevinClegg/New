package Model;

public class Artikel {
	private int Menge;
	private String Name;
	private int Preis;
	

	public Artikel(int menge, String name, int preis) {
		super();
		this.Menge = menge;
		this.Name = name;
		this.Preis = preis;
		
		
	}
	public int getMenge() {
		return Menge;
	}
	public void setMenge(int menge) {
		this.Menge = menge;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getPreis() {
		return Preis;
	}
	public void setPreis(int preis) {
		this.Preis = preis;
	}
	
	
	@Override
	public String toString() {
		return "Artikel [Menge=" + Menge + ", Name=" + Name + ", Preis=" + Preis + ", getMenge()=" + getMenge()
				+ ", getName()=" + getName() + ", getPreis()=" + getPreis() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
