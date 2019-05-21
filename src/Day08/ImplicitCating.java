package Day08;

public class ImplicitCating {
	public static void main(String[] args) {
		short shortValue=3455;
		int intValue= shortValue;
		System.out.println("int value: " + intValue);
		
		double price= 345;
		System.out.println(price);
		int price1= 34563;
		double dPrice= (double)price1;
		System.out.println("dPrice after casting "+dPrice);
		
	}

}
