package day20_forLoop;

public class EvenOrOdd {
public static void main(String[] args) {
	
	for(int num=1; num<=100;num++) {
		if(num%2==0) {
			System.out.print(num+" ");
		}	
	}
	for(int j=1; j<=100;j++) {
		if(j%2==1) {
			System.out.println(j+" ");
		}
	}
	
	int sumOfOdds=0;
	int sumOfEvens=0;
	
	for(int num=1;num<=100; num++) {
		if(num%2==0) {
			sumOfEvens+=num;
			
		}else {
			sumOfOdds+=num;
		}
	}
	System.out.println("Sum of evens:"+sumOfEvens);
	System.out.println("Sum of odds"+sumOfOdds);
	
}
}
