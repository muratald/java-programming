package Day36_wrapper_classes_arrayslistIntro;

public class boxing {
public static void main(String[] args) {
	Integer num1=1234;
	int n=5;
	Integer num2=n;
	//Unboxing -> object-> primitive
	
	Double d1=new Double(34.2);
	double d2=d1;
	System.out.println("d1: " +d1);
	System.out.println("d2: "+d2);
	
	long l1=new Long(6000000);
	long l2=new Long(4);
}
}
