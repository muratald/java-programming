package Day31;

import java.util.Scanner;

public class warmup {
public static void main(String[] args) {
	
	countUp(5);
	int n=5;
	countDown(n);
	System.out.println();
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter num to countUp");
	int inputUp=scan.nextInt();
	
	countUp(inputUp);
	
	drive("Audi",60);
}



public static  void countUp(int num) {
	if(num<1) 
		System.out.println("Invalid input");
	for (int i=1;i<=num;i++) {
		
			System.out.print(i+" ");
	}
			System.out.println();
}

public static void countDown(int num) {
	if(num<1)
		System.out.println("invalid input");
	for(int j=num;j>=1;j--) {
		
			System.out.print(j+" ");
	}
}

public static void drive(String car, int speed) {
	System.out.println(car+" is driving "+speed+" mph");
	
}


}
