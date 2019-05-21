package Day08;

import java.util.*;
public class PhoneNumber {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//System.out.println("Enter your area code: ");
		int areaCode= scan.nextInt();
		
		//System.out.println("Enter local number: ");
		int localNumber= scan.nextInt();
		
		String phoneNumber = "("+areaCode+")-"+ localNumber;
		System.out.println("Calling number"+phoneNumber);
		
	}

}
