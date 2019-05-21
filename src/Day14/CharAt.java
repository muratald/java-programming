package Day14;
import java.util.*;
public class CharAt {
public static void main(String[] args) {
	String word="Computer";
	System.out.println(word.charAt(0));
	System.out.println(word.length());
	
	String word2="Java";
	
	System.out.println(word2.charAt(0));
	if(word2.charAt(0)=='J') {
		System.out.println("J is first char");
	}else {
		System.out.println("J is not first char");
	}
	
	String word3="astana";
	char first=word3.charAt(0);
	char last=word3.charAt(5);
	
	
	if(first==last) {
		System.out.println("Match");
	}else {
		System.out.println("Do not match");
	}
	
	String word4="java";
	char lastChar=word4.charAt(word4.length()-1);
	
	System.out.println("Lats value of " + word4+ " is " +lastChar);
	
	double price = 0;
    String storageType, screenType, cpu;
    int ram = 0 ;
    Scanner scan = new Scanner(System.in);
	
	
	
}
}
