package Day23;
import java.util.*;
public class user6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String word="";
		String allWords="";
		for(int i=0;i<6;i++) {
			System.out.println("Enter word: ");
			word=scan.next();
			if (word.equals("java")) {
				continue;
			}
		allWords+=word+", ";
		}
		System.out.println(allWords);
	}

}
