package Day23;

public class PrintWord {
public static void main(String[] args) {
	String word="java";
	for(int i =0;i<=word.length()-1;i++) {
		if(word.substring(i,i+1).contentEquals("a")) {
			continue;
		}
		System.out.println(word.substring(i,i+1));

	}
}
}
