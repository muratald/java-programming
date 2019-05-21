package Day46_Static;

public class CalcTest {
public static void main(String[] args) {
	double result=Calculator.plus(55, 7);
	System.out.println("result: "+result);
	
	result=Calculator.minus( 44, 14);
	System.out.println("result: "+result);
	
	Calculator c=new Calculator();
	System.out.println(c.multiply(4, 2));
	
	int i=Integer.parseInt("33");
	Character.isDigit('5');
	

	
	
}

}
