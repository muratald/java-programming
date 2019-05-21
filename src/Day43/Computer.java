package Day43;

public class Computer {
	private String brand;
	private String os;
	double price;
	
	public Computer() {
		System.out.println("Computer constructor...");
		brand="unknown";
		os="unknown";
	}
	public Computer(String brand, String os, double price) {
		this.brand =brand;
		this.os=os;
		this.price=price;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", os=" + os + ", price=" + price + ", getBrand()=" + getBrand()
				+ ", getOs()=" + getOs() + ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
		
	}
	
	
	
	
}
