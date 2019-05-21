package Day24;

public class ArraysOfChars {
	public static void main(String[] args) {
		char [] values = {'a', 'b', 'c'};
		for(char value: values) {
			System.out.println(value);
		}
	
	String str="Wooden Spoon";
	char[] chars =str.toCharArray();
	for(char c: chars) {
		System.out.println(c+"_");
		
	}
	for(int i = chars.length-1;i>=0;i--) {
		System.out.println(chars[i]);
	}
	System.out.println(str);
	
	for(char c: chars) {
		
	}
	
	
	}
}
