package Day14;
import java.util.*;
public class ajaja {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
		
	if(word1.length()==3 && word2.length()==3) {
		System.out.print(word1.charAt(0));
		System.out.print(word2.charAt(0));
		System.out.print(word1.charAt(1));
		System.out.print(word2.charAt(1));
		System.out.print(word1.charAt(2));
		System.out.print(word2.charAt(2));
	}else {
		System.out.println("cannot merge");
	}
	
}
}