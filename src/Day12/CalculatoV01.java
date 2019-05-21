package Day12;
import java.util.*;
public class CalculatoV01 {
	public static void main(String[] args) {
		
	
Scanner scan= new Scanner(System.in);
double num1, num2,num3;
double result=0.0;
String operator;
System.out.println("Enter first number ");
num1 = scan.nextDouble();
System.out.println("Enter second number ");
num2= scan.nextDouble();
System.out.println("Select operator: +, -, *, /, %");
operator=scan.next();

switch(operator) {
case "+":
	result=num1+num2;
	break;
case "-":
	result=num1-num2;
	break;
case "*":
	result=num1*num2;
	break;
case "/":
	result=num1/num2;
	break;
case "%":
	result=num1%num2;
	break;
default:
	System.out.println("Invalid operator selected: "+operator);
	
}


}
}


