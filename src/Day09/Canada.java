package Day09;
import java.util.Scanner;
public class Canada {
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		System.out.println("What is the capital of Canada?");
		
		
		String capital=keyboard.nextLine();
		if(capital.equalsIgnoreCase("Ottawa")) {
			System.out.println("Your answer is correct!");
		}else {
			System.out.println("Your answer is incorrect! "+capital+" is not capital of Canada");
			//EqualsIgnoreCase method of String, will not worry about upper case or lower case differences when checking for equality.
			
			
			
			
			
			

		}
	}

}
