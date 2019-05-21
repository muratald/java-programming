package Day46_Static;

public class Customer {
private String name;
private String email;
static int count;//shared and cared by all objects
				// 



@Override
public String toString() {
	return "Customers [name=" + name + ", email=" + email + "]";
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}



public Customer(){
	name="undefined";
	email="undefined";
	count++;
		
}
public Customer(String name, String email) {
	this.name=name;
	setEmail(email);
	count++;
}

}
