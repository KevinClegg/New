package Model;

public class ShopAdresse {
	private String ShopName;
	private String Stra�e;
	private String PLZ;
	private int Nummer;
	
	
	public String getShopName() {
		return ShopName;
	}
	public void setShopName(String shopName) {
		ShopName = shopName;
	}
	public String getStra�e() {
		return Stra�e;
	}
	public void setStra�e(String stra�e) {
		Stra�e = stra�e;
	}
	public String getPLZ() {
		return PLZ;
	}
	public void setPLZ(String pLZ) {
		PLZ = pLZ;
	}
	public int getNummer() {
		return Nummer;
	}
	public void setNummer(int nummer) {
		Nummer = nummer;
	}
	
	
	@Override
	public String toString() {
		return "ShopAdresse [ShopName=" + ShopName + ", Stra�e=" + Stra�e + ", PLZ=" + PLZ + ", Nummer=" + Nummer
				+ ", getShopName()=" + getShopName() + ", getStra�e()=" + getStra�e() + ", getPLZ()=" + getPLZ()
				+ ", getNummer()=" + getNummer() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
