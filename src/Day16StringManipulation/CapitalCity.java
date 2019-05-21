package Day16StringManipulation;
import java.util.*;
public class CapitalCity {
public static void main(String[] args) {
	String str="Moscow is a capital of Russia";
	str=str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan");
	System.out.println(str);
	
	String email="firstName_LastName@gmail.com";
	
	String company="capitalone";
	
	String newEmail=email.replace("gmail", company);
	
	company=company.replace("deloite", "gmail");
	System.out.println(newEmail);
	
	
	
	
	
}
}
