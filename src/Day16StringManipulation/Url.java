package Day16StringManipulation;
import java.util.*;
public class Url {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter url:");
	
	String url=scan.next();
	
	if(url.startsWith("www.")) {
	System.out.println("www. is present");
	}else {
		System.out.println("Not valid");
		return;
	}
	int dotIndex=url.length()-4;
	if(url.charAt(dotIndex)=='.') {
		System.out.println(". is there before extension");
	}else {
		System.out.println(". might be misplaced");
	}
	//if(url.charAt(url.length()-4)=='.') {}
	String domain=url.substring(4, dotIndex);
	System.out.println("Domain: "+domain);
	String extension=url.substring(dotIndex+1, url.length());	
	System.out.println("Extension: "+extension);
	
}
}
