package Day16StringManipulation;

public class Concat {
	public static void main(String[] args) {
		String word="java";
		System.out.println(word.concat("+selenium"));
		System.out.println(word.concat(" in eclipse"));
		
		//word=word.concat(123); will not work
		word=word+123;
		System.out.println(word);
		
		String word2="Hi";
		word2=word2.concat("-hey").concat("-how are you").concat("-good");
		System.out.println(word2);
		
		
	}

}
