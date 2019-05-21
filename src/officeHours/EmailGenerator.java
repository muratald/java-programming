package officeHours;

public class EmailGenerator {
	static String companyName = "Deloite";
	String name;
	
	public EmailGenerator(String name) {
		this.name=name;
	}
	
	public String getEmail() {
		return name+"@"+companyName+".com";
		
	}

}
