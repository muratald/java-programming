package FundamentalReviewSession2;

public class Emplyee {
	String firstName;
	String lastName;
	int employee_id;
	int age;
	float hourlyRate;
	char gender;
	String title;
	boolean isInsured;
	String insured;
	String email;
	String[] titles= {"Developer","Scrum master","SDET","PO","QA Analyst","BA"};
	
	//instance method
	public void printInfo() {
		System.out.println("First name: " + firstName + ", Last name: " + lastName + ", Employee id: " + employee_id
				+ ", Age: " + age + ", Hourly rate: " + hourlyRate + "$, Gender: " + gender + ", Insured? " + isInsured
				+ ", Title: " + title+", Email: "+email);
	}
	
	//lets create a method that generates an email for emplyee
	//use firstname_lastname@gmail.com as a template
	//your method supposed to accept object of 
	
	
	public String generateEmail() {
		return firstName+"_"+lastName+"@gmail.com";
	}
	
	public void setEmail(String e) {
		email=e;
	}
	public void printEmail() {
		System.out.println("Email of "+firstName+" "+lastName+" : "+email);
	}
	
	
}
