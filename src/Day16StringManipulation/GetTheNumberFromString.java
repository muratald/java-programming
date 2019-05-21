package Day16StringManipulation;

public class GetTheNumberFromString {
	public static void main(String[] args) {
	String sentence="I wrote [236] lines of code today";
	int start=sentence.indexOf('[')+1;
	int end=sentence.indexOf(']');
	
	String codeCount=sentence.substring(start, end);
	System.out.println("Lines of code:"+codeCount);
	
	//System.out.println(sentence.substring(sentence.index));
	
	int count=Integer.parseInt(codeCount);
	if(count>20) {
		System.out.println("Wrote more than 20 lines of code Today!!!");
	}else {
		System.out.println("Not enough coding for today");
	}
	String word="java";
	
	String word1="java";
	word.replace("a","e");
	
}
}
