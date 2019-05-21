package Day23;
import java.util.*;
public class WarmUp {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	int num = scan.nextInt();
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			System.out.println("this is not a prime number");
			return;
		}
	}
	System.out.println("this is a prime number");
	
	
}
}
