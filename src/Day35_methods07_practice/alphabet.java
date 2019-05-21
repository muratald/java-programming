package Day35_methods07_practice;

public class alphabet {
	public static void main(String[] args) {
	
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
String word = "civic";
		
		//get a char from word
		//find indexOf the char in alphabet
		//read the char from encrypted at that index
		//add to some string
		char first = word.charAt(0); // 'e'
		int position = alphabet.indexOf(first);
		System.out.println("position: " + position);
		char enChar = encrypted.charAt(position);
		System.out.println(first + " --> " + enChar);
		
		//with a loop
		String encryptedWord = "";
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			//find in alphabet
			int index = alphabet.indexOf(ch);
			//System.out.print(encrypted.charAt(index));
			encryptedWord+=encrypted.charAt(index);
		}
		
		System.out.println(word);
		System.out.println(encryptedWord);
		
	}
	public static char encryptedChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted= "zyxwvutsrqponmlkjihgfedcba";
		
		int i =alphabet.indexOf(ch);
		char ret = encrypted.charAt(i);
		return ret;
		
		
		
		
		
		
		
		
	}
	
	public static String encryptedWord(String word) {
		String cyphered="";
		for(int i=0;i<word.length();i++) {
			cyphered+=encryptedChar(word.charAt();
		}
	}
}
