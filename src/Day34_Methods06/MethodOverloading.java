package Day34_Methods06;

public class MethodOverloading {
	public static void main(String[] args) {
		add(1000,20);
		add("one","two");
		long l1=1234L;
		long l2=34534L;
		add(l1,l2);
	}
	
public static void add(int num1, int num2) {
	int result=num1+num2;
	System.out.println("Result: "+result);
}
public static void add(long num1, long num2) {
	long result=num1+num2;
	System.out.println("Result: "+result);
}
public static void add(String num1, String num2) {
	String result=num1+num2;
	System.out.println("Result: "+result);
}

}
