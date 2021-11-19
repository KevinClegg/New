package Model;

public class ShopAdresse {
	private String ShopName;
	private String Stra�e;
	private String PLZ;
	private int Nummer;
	
	
	
	
	
	public ShopAdresse(String shopName, String stra�e, String pLZ, int nummer) {
		super();
		ShopName = shopName;
		Stra�e = stra�e;
		PLZ = pLZ;
		Nummer = nummer;
	}
	public String getShopName() {
		return ShopName;
	}
	public void setShopName(String shopName) {
		this.ShopName = shopName;
	}
	public String getStra�e() {
		return Stra�e;
	}
	public void setStra�e(String stra�e) {
		this.Stra�e = stra�e;
	}
	public String getPLZ() {
		return PLZ;
	}
	public void setPLZ(String pLZ) {
		this.PLZ = pLZ;
	}
	public int getNummer() {
		return Nummer;
	}
	public void setNummer(int nummer) {
		this.Nummer = nummer;
	}
	
	
	@Override
	public String toString() {
		return "ShopAdresse [ShopName=" + ShopName + ", Stra�e=" + Stra�e + ", PLZ=" + PLZ + ", Nummer=" + Nummer
				+ ", getShopName()=" + getShopName() + ", getStra�e()=" + getStra�e() + ", getPLZ()=" + getPLZ()
				+ ", getNummer()=" + getNummer() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
