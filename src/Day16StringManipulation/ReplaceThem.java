package Day16StringManipulation;
import java.util.*;
public class ReplaceThem {
public static void main(String[] args) {
	String sentence="Coding is fun,it is my hobby!!";
	String withNoSpaces=sentence.replace(" ", "");
	
	String mixed="&^@#j$a-via@&#$";
	mixed=mixed.replace("&^@#", "");
	
	mixed=mixed.replace("$", "");
	mixed=mixed.replace("-", "");
	mixed=mixed.replace("i", "");
	mixed=mixed.replace("@", "");
	mixed=mixed.replace("&", "");
	mixed=mixed.replace("#", "");
	mixed=mixed.replace("$", "");
	System.out.println(mixed);
	
	String result="About 115,000,000 results (0.66 seconds)";
	result=result.replace("About", "");
	result=result.replace("results (0.66 seconds)", "");
	System.out.println(result);
	
	
	
}
}
