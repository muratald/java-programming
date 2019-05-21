package Day11;
import java.util.*;
public class warmUp {
	 public static void main(String[] args) {
		    //DO NOT CHANGE
		    Scanner scan = new Scanner(System.in);
		    //WRITE YOUR CODE HERE 
		    int age;
		    System.out.println("Enter age:");
		    age=scan.nextInt();
		    if (age<2) {
		    System.out.println("ineligible");
		   
		  } else if (age==2) {
			 System.out.println("toddler");
		  } else if (3<=age && 5>=age) {
		    System.out.println("early childhood");
		  } else if (6==age && 7==age) {
			System.out.println("young reader");  
		  } else if (age>=8 && age<=10) {
			  System.out.println("elementary");
		  } else if (age==11 || age==12) {
			  System.out.println("middle");
		  } else if (age==13) {
			  System.out.println("impossible");
		  }else if (14<=age && 16>=age) {
			  System.out.println("high school");
		  }else if (17<=age && 18>=age) { //age==17 || age==18
			  System.out.println("scholar");
		  }else if (age>18) {
			  System.out.println("ineligible");
		  }
		  }
}
