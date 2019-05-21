package Day14;
import java.util.*;

public class TipCalculator {
	
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Split or No split");
    String split=scan.next();
    
    System.out.println("Number of people:");
    int numberOfPeople=scan.nextInt();
    
    System.out.println("Check amount:");
    double checkAmount=scan.nextDouble();
    
    System.out.println("Service quality:");
    String serviceQuality=scan.nextLine();
    
    double totalTip=0.0;
    switch (serviceQuality) {
    case "Poor":
    	totalTip= checkAmount * .05;
    	break;
    case "Fair":
    	totalTip= checkAmount* .1;
    	break;
    case "Good":
    	totalTip= checkAmount* .15;
    	break;
    case "Great":
    	totalTip=checkAmount*.2;
    	break;
    case "Excellent":
    	totalTip=checkAmount*.25;
    	break;
    }
    switch(numberOfPeople) {
    case 1: 
    	System.out.println("&");
    	break;
    case 2: 
    	System.out.println("&&");
    	break;
    case 3: 
    	System.out.println("&&&");
    	break;
    case 4: 
    	System.out.println("&&&&");
    	break;
    case 5: 
    	System.out.println("&&&&&");
    	break;
    case 6: 
    	System.out.println("&&&&&&");
    	break;
    case 7: 
    	System.out.println("&&&&&&&");
    	break;
    case 8: 
    	System.out.println("&&&&&&&&");
    	break;
    case 9: 
    	System.out.println("&&&&&&&&&");
    	break;
    case 10: 
    	System.out.println("&&&&&&&&&&");
    	break;
    
    }
    
    System.out.println("Total to pay: "+checkAmount+totalTip);
    System.out.println("Total tip: ");
    
    switch (split) {
    case "Yes":
    	System.out.println("Total per person: "+ (checkAmount+totalTip)/numberOfPeople);
    	System.out.println("Tip per person: "+totalTip/numberOfPeople);
    case "No":
    	System.out.println("Total per person: "+ checkAmount+totalTip);
    	System.out.println("Tip per person: "+totalTip);
    }

	
}

}
