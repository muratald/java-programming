package Day45;

import java.util.Random;

public class EtsyAccount {
	
	private String email,firstName,password;
	
	//constructor 1. No-args. sets all as emty string
	
	public EtsyAccount() {
		email="";
		firstName="";
		password="";
		
	}
	
	//constructor 2. takes 3 args and sets them to instance variables
	//using setters
	public EtsyAccount(String email,String firstName,String password) {
		setEmail(email);
		setFirstName(firstName);
		setPassword(password);
		
	}
	//constructor 3. 
	public EtsyAccount(String firstName, String email) {
		setEmail(email);
		setFirstName(firstName);
		this.password=getRandomPassword();
	}
	private String getRandomPassword() {
		Random rd=new Random();
		String letters="abcdefghijklmopqrstuvwxyz";
		String rdPassword="";
		for(int i =1;i<=6;i++) {
			rdPassword+=letters.charAt(rd.nextInt(letters.length()));
		}
		return password;
	}

	@Override
	public String toString() {
		return "EtsyAccount [email=" + email + ", firstName=" + firstName + ", password=" + password + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email.indexOf("@")>0 && email.indexOf('@')!=email.length()-1) {
			this.email = email;
		}
		System.out.println("Please enter a valid email address!");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	private boolean isValidFirstName(String firstName) {
		if(firstName.startsWith(" ") || firstName.endsWith(" ")) {
			return false;
		}
		
		if(firstName.isEmpty()) {
			System.out.println("Cannot be blank.");
			return false;
		}
		for(int i=0;i<firstName.length();i++) {
			char ch=firstName.charAt(i);
			if(Character.isAlphabetic(ch)&& ch !=' ') {
				return false;
			}
		}
		return true;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
