package Day08;
import java.util.Scanner;

public class Assignments {


	  public static void main(String[] args) {
	    // Enter your code here
	    String subject1, subject2, subject3, subject4, subject5;
	    Double grade1, grade2, grade3, grade4, grade5, average, summary;
	    
	    Scanner scan= new Scanner(System.in);
	    System.out.println("Welcome to the Grader");
	    
	    System.out.println("Please enter subject name 1 and score for this subject");
	    subject1=scan.next();
	    grade1=scan.nextDouble();
	    
	    System.out.println("Please enter subject name 2 and score for this subject");
	    subject2=scan.next();
	    grade2=scan.nextDouble();
	    
	    System.out.println("Please enter subject name 3 and score for this subject");
	    subject3=scan.next();
	    grade3=scan.nextDouble();
	  
	    System.out.println("Please enter subject name 4 and score for this subject");
	    subject4=scan.next();
	    grade4=scan.nextDouble();
	    
	  
	    System.out.println("Please enter subject name 5 and score for this subject");
	    subject5=scan.next();
	    grade5=scan.nextDouble();
	    
	    summary = grade1+grade2+grade3+grade4+grade5;
	    average=(double)(summary/5);
	    System.out.println("Summary: Math -"+" "+grade1+","+"  Biology -"+" "+grade2+","+"  English -"+" "+grade3+","+"  Chemistry -"+" "+grade4+","+"  Music -"+" "+grade5);
	    System.out.println("Your average score is:"+" "+average);
	    System.out.println("Thank yo for using grader!");
	    System.out.println("Goodbye");
	    
	  }
}
