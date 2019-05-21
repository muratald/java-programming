package Day31;

import java.util.Arrays;

public class MethodsWithString {
	public static void main(String[] args) {
		countWords("Java is fun");
		googleSearchResult("About 121,000,000 results (0.75 seconds)");
//		String resultsStr="About "
	}
	
	
	public static void countWords(String sentence) {
		String[] words=sentence.split(" ");	
		System.out.println("Words in this sentence: "+Arrays.toString(words));
		System.out.println("Number of words: "+words.length);
		
	}

	public static void googleSearchResult(String search ) {
		String[] words=search.split(" ");
		String count=words[1].replace(","," , ");
		String seconds=words[3].replace("(", "");
		System.out.println("Results in count: "+count);
		System.out.println("Time in seconds: "+ seconds );
	}

}