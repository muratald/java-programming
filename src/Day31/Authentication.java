package Day31;

public class Authentication {
public static void main(String[] args) {
	
	login("mentoring@cybertekschool","mentor001");
	login("asa","asa");
	
	
}

public static void login(String username, String password) {
	String validUsername="mentoring@cybertekschool";
	String validPassword="mentor001";
	
	
	if(username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
		System.out.println("Login Successful! Welcome to Okta!");
	}else {
		System.out.println("Sign in failed");
	}
	
}
}
