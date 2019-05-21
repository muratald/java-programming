package Day19;
import java.util.*;
public class Loops {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("What is you current balance?");
	double balance=scan.nextDouble();
	int count=0;
	
	
	while(balance>0) {
		count++;
		
		System.out.println("What is a transaction #"+count+ "amount?");
		
		double transactionAmount=scan.nextDouble();
		if(transactionAmount>=balance) {
			System.out.println("Your balance is about to be negative due to this transaction");
		}
		balance-=transactionAmount;
		System.out.println("Current balance: "+balance);
		
	}
	
	System.out.println("You have insufficient funds for anymore transactions, your balance is "+balance);
	System.out.println("Transaction total count: " +count);
	}

}
