package Day15;

public class StartsEndsWith {
public static void main(String[] args) {
	String word1="eclipse";
	System.out.println(word1.startsWith("e"));
	System.out.println(word1.startsWith("ec"));
	
	System.out.println(word1.endsWith("e"));
	System.out.println(word1.endsWith("ipse"));
	
	String name ="Mr. Jackson";
	
	if(name.startsWith("Mr.")) {
		System.out.println("man");
		
	}else if(name.startsWith("Mrs.")) {
		System.out.println("Married woman");
	}else if(name.startsWith("Ms")) {
		System.out.println("Some woman");
	}else if(name.startsWith("Dr.")) {
		System.out.println("Doctor man or woman");
	}else {
		System.out.println("Unknown status");
	}
	
	
	
	
	
}
}
