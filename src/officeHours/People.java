package officeHours;

public class People {
	String hardToGet="Nursultan";
	
	static String easyToGet="Muhtar";
	
	public void sayMyName() {
		System.out.println(hardToGet);
	}
	
	public static void whatMyName() {
		System.out.println(easyToGet);
	}
	//static method cannot call non-static method
	//System.out.println(hardToGet);
}
