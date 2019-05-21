package Day15;
import java.util.*;
public class WarmUpEmoji {
public static void main(String[] args) {
	String smile=":(";
	
	if(smile.length()!=2) {
		System.out.println("Invalid emoji");
		return;
	}
	char first=smile.charAt(0);
	char second=smile.charAt(1);
	if(first==':') {
		if(second==')') {
			System.out.println("smile");
		}else if(second=='(') {
			System.out.println("sad");
		}else if(second=='/') {
			System.out.println("upset");
		}else if(second=='p') {
			System.out.println("playful");
		}else {
			System.out.println("Unknown emoji");
		}
		
	}else if(first==';') {
		if(second==')') {
			System.out.println("wink");
		}else if(second=='(') {
			System.out.println("");
		}
	}
}
}
