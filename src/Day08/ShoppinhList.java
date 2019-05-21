package Day08;
import java.util.Scanner;
public class ShoppinhList {
	public static void main(String[] args) {
	    //WRITE YOUR CODE HERE:
	    String item1,item2,item3,report;
	    double price1,price2,price3,totalPrice;
	    int count1,count2,count3;
	    report=null;
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("Enter Item1, count and its price");
	    item1=scan.next();
	    count1=scan.nextInt();
	    price1=scan.nextDouble();
	    
	    System.out.println("Enter item2, count and its price");
	    item2=scan.next();
	    count2=scan.nextInt();
	    price2=scan.nextDouble();
	    
	    System.out.println("Enter Item3, count and its price:");
	    item3=scan.next();
	    count3=scan.nextInt();
	    price3=scan.nextDouble();
	    
	    price1=price1*count1;
	    price2=price2*count2;
	    price3=price3*count3;
	    totalPrice=price1+price2+price3;
	    
	    
	    
	    
	    if(price1!=0) {
	    	report="Item1: "+item1+" Price: "+price1;
	    }
	    if(price2!=0) {
	    	report=report+",Item2: "+"Price: "+price2;
	    }
	    if(price3!=0) {
	    	report=report+", Item3: "+item3+" Price: "+price3;
	    }
	    System.out.println(report);
	    System.out.println("Total price: "+totalPrice);
	    
	    
	    
	    
	    
	    
	}
}
