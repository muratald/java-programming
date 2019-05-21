package Day21;
import java.util.*;
public class register {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	System.out.println("How many items?");
	int itemsCount=scan.nextInt();
	int count=1;
	String items="";
	double sum=0.0;
	while(count<=itemsCount) {
		System.out.println("What is item"+count+"and price?");
		String itemName=scan.next();
		double price=scan.nextDouble();
		count++;
		items+=itemName+", ";
		sum+=price;
	}
	System.out.println(items.substring(0,items.length()-2));
	System.out.println(sum);
}
}
