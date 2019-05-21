package Day09;

public class IfStatementWithBooleanVariables {
	public static void main(String[] args) {
		boolean isBreakTime=true;
		if (isBreakTime) {
			System.out.println("BREAK TILL 8:35");
		}else {
			System.out.println("Not Break time yet.");
		}
		boolean classTime=false;
		
		if(classTime==false) {
			System.out.println("Come back on time");
			System.out.println("Stop talking");
			System.out.println("Pay Attention");
			System.out.println("Code and have fun");
			
		}else {
			System.out.println("Take a walk and have some water");
		}
		boolean qualified=false;
		if(qualified==false) {
			System.out.println("Your application was not approved. Thank You!");
			
			
		}
		
	}

}
