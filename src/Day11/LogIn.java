package Day11;
import java.util.*;
public class LogIn {
	public static void main(String[] args) {
		
	
Scanner scan=new Scanner(System.in);
System.out.println("Enter username:");
String username=scan.next();

System.out.println("Enter password");
String password= scan.next();

String validUsername = "cybertek@gmail.com";
String validPassword = "WoodenSpoon123";



if (username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
	System.out.println("login Successful, Welcome!");
}
else if (!username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {
	System.out.println("Invalid username and Invalid Password");
}
else if(username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {
	System.out.println("Invalid password");
}
else if(!username.equalsIgnoreCase(validUsername) && password.contentEquals(validPassword)) {
	System.out.println("Invalid Username");
}


	

	}
}