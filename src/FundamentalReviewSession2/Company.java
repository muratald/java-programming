package FundamentalReviewSession2;
import java.util.*;
public class Company {
	//public static void main(String[] args) {
//		Emplyee emplyee1=new Emplyee();
//		emplyee1.firstName="Pavel";
//		emplyee1.printInfo();
//		Emplyee emplyee2=new Emplyee();
//		emplyee2.firstName="Murad";
//	//	Emplyee[] it_department=new Emplyee[2];
//		
//		emplyee1.generateEmail();
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("No oN"));
	}
		public static boolean isPalindrome(String check) {
		    String reverse="";
		    boolean palindrome=false;
		    for(int i=check.length()-1;i>=0;i--){
		      if(Character.isAlphabetic(check.charAt(i))){
		        reverse=reverse+check.charAt(i);
		      }
		    }
		    if(reverse.equalsIgnoreCase(check)){
		      palindrome = true;
		    }
		    return palindrome;
		  }
		
	}
//}
