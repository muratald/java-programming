package Day19;
import java.util.*;
public class GuessANumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random random=new Random();//generates random numbers
		
		System.out.println("### Welcome to Guess a Number Game ###");
		
		int secretNumber=random.nextInt();
		int guessNumber=0;
		
		do {
			System.out.println("Guess  number:");
			guessNumber=scan.nextInt();
			if (guessNumber<secretNumber) {
				System.out.println("Your number is too small");
			}else if(guessNumber>secretNumber) {
				System.out.println("Your number is too large");
			}
			
		}while(guessNumber !=secretNumber);
		
		System.out.println("Bingo, Congratulations, you won!");
		
		
	}

}
