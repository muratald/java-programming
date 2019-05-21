package Day33Methods;



public class CalcTest {
public static void main(String[] args) {

	System.out.println(write2Methods.add(3, 1));
	System.out.println(write2Methods.multiply(5,6));
	System.out.println(write2Methods.minus(20,6));
	System.out.println(write2Methods.division(25,6));
	
	int addResult= write2Methods.add(21,41);
	double mResult=write2Methods.multiply(4, 2);
	double miResult=write2Methods.minus(4,2);
	double dResult=write2Methods.division(6, 4);
	
	System.out.println("addResult: "+addResult);
	System.out.println("mResult: "+mResult);
	System.out.println("miResult: "+miResult);
	System.out.println("dResult: "+dResult);
	
	int a=10, b=5;
	int myResult=write2Methods.minus(a,b);
	
	
	double[] dNums= {2.0,4.0};
	double result2=write2Methods.multiply(dNums[0], dNums[1]);
	System.out.println("result2: "+result2);
	
	if(write2Methods.add(10, 16)==26) {
		System.out.println("Add Unit Test Passed");
	}else {
		System.out.println("Add unit test failed");
	}
	String str="java";
	if(str.length()==4) {
		System.out.println("It is 4 characters");
	}else {
		System.out.println("It is not 4 chararcters");
	}


	
	
}
}
