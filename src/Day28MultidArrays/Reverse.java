package Day28MultidArrays;

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
	
		String sentence= "My name is Murat";
		String[] words=sentence.split(" ");
		System.out.println("Number of words: "+words.length);
		System.out.println(Arrays.toString(words));
		String reversed="";
		for(int i =words.length-1;i>=0;i--) {
			
			System.out.print(words[i]+" ");
			
		}
		
		
		
		
	}
}
