package Day31;
import java.util.*;
public class Calculator {
public static void main(String[] args) {
	add(5,11);
	mult(5,11);
	division(5,0);
	remainder(10,5);
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 2 numbers:");
	double n1=scan.nextDouble();
	double n2=scan.nextDouble();
	System.out.println("Select operation: '+','-','/','*','%' ");
	String opeartor=scan.next();
	
	switch (opeartor){
	case "+":
		add(n1,n2);
		break;
	
	case "-":
		substract(n1,n2);
		break;
	
	case "/":
		division(n1,n2);
		break;
	
	case "*":
		mult(n1,n2);
		break;
	
	case "%":
		remainder(n1,n2);
		break;	
	
	}
	
}

public static void add(double num1,double num2) {
	double result=num1+num2;
	System.out.println("Result: "+result);
}

public static void substract(double num1,double num2) {
	double result=num1-num2;
	System.out.println("Result: "+result);
}

public static void division(double num1, double num2) {
	if(num2==0) {
		System.out.println("Cannot divide by 0");
		return;//exit the method here, do not run the test
	}
	double result=num1/num2;
	System.out.println("Result: "+result);
}

public static void mult(double num1, double num2) {
	double result=num1*num2;
	System.out.println("Result: "+result);
}

public static void remainder(double num1, double num2) {
	double result=num1%num2;
	System.out.println("Result: "+result);
}

}
