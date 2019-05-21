package Day08;
import java.util.Scanner;
public class GradeCheck {
	public static void main(String[] args) {
		//A,B,C,D
		//char grade=scan.next()charAt();
		//if grade is 'A'=>
	int A=100;
	int B=75;
	int C=50;
	int D=35;
	Scanner keyboard = new Scanner (System.in);
	System.out.println("What is you grade?");
	char grade = keyboard.next().charAt(0);
	if (grade=='A') {
		System.out.println("Excellent job ! Keep it up!");
	} else {
		System.out.println("Your grade "+grade+" is not good enough");
		System.out.println("How many points did you miss for 'A?");
		int points=keyboard.nextInt();
		System.out.println("You could earn "+points+" more points if you studied harder");
	}
	}

}
