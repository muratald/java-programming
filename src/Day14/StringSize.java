package Day14;

public class StringSize {
	public static void main(String[] args) {
		String str1="Good Morning";
		//check if it matches "Good Morning" and print match or Not print match
		
		if (str1.equals("Good Morning")) {
			System.out.println("Match");
		}else {
			System.out.println("New Match");
		}	
		if(str1.equalsIgnoreCase("good morning")){
			System.out.println("Match - ignore case");
		}else {
			System.out.println("Not Match - ignore case");
		}	
			System.out.println(str1.toUpperCase());
			System.out.println(str1);
			str1=str1.toUpperCase();
			System.out.println(("After assignment: " +str1));
			
			if(str1.toLowerCase().equals("good morning")) {
				System.out.println("Chained methods: match");
			}else {
				System.out.println("Chained methods: do not match");
			}
			
			String myName="Murat";
			System.out.println(myName.length());
			int length=myName.length();
			System.out.println("My name's lentgth:"+length);
			
			//usernames must be exactly 8 characters
			
			String username="panther1";
			if (username.length()==8) {
				System.out.println("Valid username");
			}else {
				System.out.println("Invalid username, must be 8 chars");
			}
			String password="woodenSpoon";
			
			if(password.length()>=6) {
				System.out.println("Valid password");
			}else {
				System.out.println("Password is too short");
			}
			int passwordLength=password.length();
			
			if (passwordLength<6) {
				System.out.println("invalid password. Too short");
			}else {
				System.out.println("Valid password, good job!");
			}
			
			
			
			
		
			
		}
	}


