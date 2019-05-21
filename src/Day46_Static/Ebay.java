package Day46_Static;

public class Ebay {
	public static void main(String[] args) {
		Customer cm1=new Customer("Abdallah Aleies","AbdallahAleies@gmail.com");
		Customer cm2=new Customer("ADILET KYRGYZ","adilet@gmail.com");
		Customer cm3=new Customer("Anastasiia Zasibna","Anastasiia@outlook.com");
		
		System.out.println(cm3.count);
		System.out.println(Customer.count);
		
		Customer cm4=new Customer("Burac Ucal","burak@yahoo.com");
		System.out.println("Total customers: "+Customer.count);
		
		cm1.count=10;
		System.out.println(cm3.count);
		System.out.println(Customer.count);
		
		
	}
}
