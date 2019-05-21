package Day19;
import java.util.*;
public class Polindrome {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter word to test:");
		
		String word="java";
		String reversed="";
		int idx=word.length()-1;
		while(idx>=0) {
			reversed=reversed + word.charAt(idx--);
			
		}
		System.out.println(reversed);
		
		if (reversed.equalsIgnoreCase(word)) {
			
		}
		
		
	}

}
