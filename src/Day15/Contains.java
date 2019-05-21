package Day15;

public class Contains {
public static void main(String[] args) {
	String email = "test@gmail.com";
	System.out.println(email.contains("@"));
	
	String list="tomatoes,eggs, apples,tomatoes, milk,bread, cereal, meat";
	
	if(list.contains("apples")) {
		System.out.println("Apples are there!");
	}else {
		System.out.println("Lets add apples now!");
	}
	
	boolean hasEggs=list.contains("eggs");
	
	System.out.println("Contains eggs: "+hasEggs);
	
	boolean hasCucumbers=list.contains("cucumbers");
	
	System.out.println("Contains cucumbers: " + hasCucumbers);
	
	email="name@yahoo.com";
	
	if(email.contains("yahoo")) {
		System.out.println("Yahoo account");
	}else if(email.contains("@gmail")){
		System.out.println("Gmail account");	
	}else if(email.contains("@hotmail.com")) {
		System.out.println("Hotmail account");
	}
	
	String name="Murat";
	if(name.contains("a") || name.contains("e")){
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	
	
	
	
	
}
}
