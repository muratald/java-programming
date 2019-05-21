package Day08;

public class CastingPrimitives {
	public static void main(String[] args) {
		//cast double value to int 
		int i=(int)3.4;
		System.out.println("i: "+ i);
		
		double price=230.50;
		int dollars= (int)price;
		System.out.println("Price: " + price);
		System.out.println("Dollars: "+ dollars);
		
		int count=242344;
		byte byteCount=(byte)count;
		System.out.println("ByteCount: " +byteCount);
		
		long longValue =345654;
		int intValue= (int)longValue;
		System.out.println("Int Value: "+intValue);
		
		int large = 5678;
		short small = (short) large;
		
		System.out.println("Small: " +small);
		
		int result= (int)(500.4/2.0);
		System.out.println("Result: "+result);
		
		byte b=123;
		
		
		
		//IMPLICIT CASTING -> Auto casting from smaller type into larger type.
		
		
		
}
}
