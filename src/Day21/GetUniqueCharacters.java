package Day21;
import java.util.*;
public class GetUniqueCharacters {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter word");
	String word=scan.next();//javva
	String unique="";
	
	for(int i =0; i<word.length();i++) {
		char letter = word.charAt(i);
//		System.out.println(letter);
		if(!unique.contains(""+letter)) {
			unique+=letter;
		}
		
	}
	System.out.println(unique);
	
//	for(int i = 0;i<word.length();i++) {
//		System.out.print(i);
//		System.out.println(word.charAt(i));
//	}
	
	
}
}
