package Model;

public class ShopAdresse {
	private String ShopName;
	private String Straﬂe;
	private String PLZ;
	private int Nummer;
	
	
	
	
	
	public ShopAdresse(String shopName, String straﬂe, String pLZ, int nummer) {
		super();
		ShopName = shopName;
		Straﬂe = straﬂe;
		PLZ = pLZ;
		Nummer = nummer;
	}
	public String getShopName() {
		return ShopName;
	}
	public void setShopName(String shopName) {
		this.ShopName = shopName;
	}
	public String getStraﬂe() {
		return Straﬂe;
	}
	public void setStraﬂe(String straﬂe) {
		this.Straﬂe = straﬂe;
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
		return "ShopAdresse [ShopName=" + ShopName + ", Straﬂe=" + Straﬂe + ", PLZ=" + PLZ + ", Nummer=" + Nummer
				+ ", getShopName()=" + getShopName() + ", getStraﬂe()=" + getStraﬂe() + ", getPLZ()=" + getPLZ()
				+ ", getNummer()=" + getNummer() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
