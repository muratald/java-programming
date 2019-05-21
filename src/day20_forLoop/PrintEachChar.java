package day20_forLoop;
import java.util.*;
public class PrintEachChar {
public static void main(String[] args) {
	String word="CybertekSchool";
	for(int i=0; i<word.length();i++) {
		char letter=word.toLowerCase().charAt(i);
		if(!(letter=='a' || letter =='e' || letter =='o' ||letter=='i'|| letter=='u' )) {
		System.out.print(letter+", ");
		}
	}
}
}
