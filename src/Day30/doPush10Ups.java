package Day30;

import java.util.Scanner;

public class doPush10Ups {
public static void main(String[] args) {
	rangePrint();
	
}
public static void rangePrint(){
	Scanner scan= new Scanner(System.in);
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	
//	while(num1<num2) {
//		
//		num1++;
//		
//		System.out.println(num1 );
//		System.out.println(num2 );
//		
//		break;
	
	if(num1 < num2) {
		for(int i = num1; i <= num2; i++) {
			System.out.print(i +" ");
		}
	}else if(num1 > num2) {
		for(int k = num1; k >= num2; k--) {
			System.out.print(k+" ");
		}
	}else {
		System.out.println(num1);
	}
	System.out.println();
	
	
	}
	
	
	
	
	
}





