package day20_forLoop;

public class CountHowMany {
public static void main(String[] args) {
	String word="computer programming";
	char myChar='a';
	int counter=0;
	
	for(int i=0;i<word.length();i++) {
		if(word.charAt(i)==myChar) {
			counter++;
		}
	}
	System.out.println("Count: "+counter);
}
}
