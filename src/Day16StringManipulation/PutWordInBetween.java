package Day16StringManipulation;

public class PutWordInBetween {
	public static void main(String[] args) {
		String chars="{{}}";
		String word = "java";
		
		String result=chars.substring(0,2)+ word+chars.substring(2);
		System.out.println(result);
		
	}

}
