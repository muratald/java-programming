package Day23;
import java.util.*;
public class CalculateSum {
	public static void main(String[] args) {
	int sum=0;
	int num=0;
	Scanner scan=new Scanner(System.in);
	for(int i=0;i<6;i++) {
		System.out.println("Enter a number");
		num=scan.nextInt();
		if(num<=0) {
			break;
		}
		sum+=num;
	}
	System.out.println("Total sum: "+sum);
}
}
