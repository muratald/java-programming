package Day19;
import java.util.*;
public class Password {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String password="abc123";
		String input;
		
		do {
			System.out.println("Enter password");
			input=scan.next();
		}while(!input.equals(password));
		
		
	}

}
