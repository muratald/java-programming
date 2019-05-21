package Day12;
import java.util.*;
public class CalculatorV01 {
public static void main(String[] args) {
	Scanner scan= new Scanner (System.in);
	double num1, num2,num3;
	double result=0.0;
	String operator;
	System.out.println("Enter first number ");
	num1 = scan.nextDouble();
	System.out.println("Enter second number ");
	num2= scan.nextDouble();
	System.out.println("Select operator: +, -, *, /, %");
	operator=scan.next();
	
	if(operator.equals("+")) {
		result=num1+num2;
		
	}else if(operator.equals("-")) {
		result=num1-num2;
		
		
	}else if (operator.equals("*")) {
		result=num1*num2;
		
	}else if (operator.equals("/")) {
		result=num1/num2;
		
	}else if (operator.equals("%")) {
		result=num1%num2;
	}else {
		System.out.println("invalid operator selected: "+operator);
		return;
	}
	
	
	
	
	
		System.out.println("Result: "+result);
		
		

	

}
}
