package Day32;

public class MethodWithReturn {
	public static void main(String[] args) {
	System.out.println(giveMe10$());
	int i=giveMe10$();
	System.out.println("i is "+i);
	System.out.println(giveMeYourName());
	}
	
	public static int giveMe10$() {
		System.out.println("returning 10 from method");
		return 10;
	}
	
	public static String giveMeYourName() {
		return "Murat";//
	}
}
