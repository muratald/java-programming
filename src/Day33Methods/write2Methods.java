package Day33Methods;

public class write2Methods {
public static void main(String[] args) {
	addVoid(10,20);
	int result=add(4,8);
	System.out.println("Result "+result);
	result=add(10,30);
	System.out.println("Result "+result);
	System.out.println(division(4,2));
	System.out.println(multiply(3,4));
	
}

public static void addVoid(int num1,int num2) {
	int sum=num1+num2;
	System.out.println("Sum: "+sum);
}

public static int add(int num1,int num2) {
	int sum=num1+num2;
	return sum;
}

public static double multiply(double num1,double num2) {
	double sum=num1*num2;
	return sum;
}
public static int minus(int num1,int num2) {
	int sum=num1-num2;
	return sum;
}

public static double division(double num1,double num2) {
	if(num2==0) {
		System.out.println("ERROR: Cannot / by 0");
		return 0;
	}else {
	double sum=num1/num2;
	return sum;
	}
}

}
