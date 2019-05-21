package Day15;
import java.util.*;
public class Replit {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    String firstName="";
	    firstName=email.substring(0,email.indexOf("_"));
	    firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1);
	    
	    String lastName="";
	    lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
	    lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1);
	    
	    
	    
	    String domain="";
	    domain= email.substring(email.indexOf("@")+1,email.indexOf("."));
	    
	    
	    String topLevelDomain="";
	    topLevelDomain=email.substring(email.indexOf(".")+1,email.indexOf(".")+4);
	    
	   System.out.println("First name: "+firstName);
	   System.out.println("Last name: "+lastName);
	   System.out.println("Domain: "+domain);
	   System.out.println("Top-Level Domain: "+topLevelDomain);
  
	     

	    

    }
}