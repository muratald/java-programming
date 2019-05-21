package Day08;
import java.util.Scanner;
public class IfElseWithScanner {
	public static void main(String[] args) {
		//passingPercentage = 65
		//yourScorePercentage = scanner
		//check if you passed or failed
		Scanner input =new Scanner (System.in);
		int passingPercentage=65;
		System.out.println("What is your score?");
		int yourScorePercentage=input.nextInt();
		
		if(yourScorePercentage>=passingPercentage) {
			System.out.println("YOU PASSED! CONGRATULATIONS!");
		}else {
			System.out.println("YOU FAILED! PRACTICE MORE! DON'T BE SAD!");
		}
}
}
