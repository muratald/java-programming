package Day07;
import java.util.Scanner;
public class Methods {
	public static void main(String[] args) {
		 int num1= 22;
		 int num2= 33;
		 int num3= 44;
		 Scanner scan= new Scanner(System.in);
		 System.out.println("Enter 3 numbers:");
		 num1 = scan.nextInt();
		 num2= scan.nextInt();
		 num3= scan.nextInt();
		 
		 int sum = num1+num2+num3;
		 
		 System.out.println("Sum of numbers:"+sum);
		    
	}

}
