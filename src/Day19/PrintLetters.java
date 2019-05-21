package Day19;

public class PrintLetters {
public static void main(String[] args) {
	String word="java";
			
	int idx=0;
	while(idx<word.length()) {
		System.out.println(word.charAt(idx++));
	}
	int idx2=word.length() -1;
	
	while(idx2>=0) {
		System.out.print(word.charAt(idx2--));
	}
	
}
}