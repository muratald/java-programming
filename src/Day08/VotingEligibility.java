package Day08;
import java.util.*;
public class VotingEligibility {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int votingAge=18;
		System.out.println("What is your age?");
		int yourAge=scan.nextInt();
		int years= yourAge-votingAge;
		if(yourAge>=votingAge) {
			System.out.println("You are eligible to vote");
			System.out.println("you have been eligible for "+(yourAge-votingAge)+" years");
		
	}	else {
		System.out.println("You are not eligible to vote");
		System.out.println("you still have "+(votingAge-yourAge)+" more years to go" );
	}
	}
}
