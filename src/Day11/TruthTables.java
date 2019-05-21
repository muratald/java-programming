package Day11;

public class TruthTables {
	public static void main(String[] args) {
		System.out.println("##### TRUTH TABLE FOR && OPERATOR ##### ");
		System.out.println("WHEN TRUE AND TRUE - RESULT IS "+(true && true));//true
		System.out.println("When true && false - result is " + (true && false));//false
		System.out.println("When false && true - result is " + (false && true));//false
		System.out.println("When false && false - result is " +(false &&false));//false
		
		System.out.println();// add an empty line 
		System.out.println("##### TRUTH TABLE FOR || OPERATOR #####");
		System.out.println("WHEN TRUE || TRUE - RESULT IS " + (true || true));//true
		System.out.println("When true || false - result is "+ (true || false ));//true
		System.out.println("When false || true - result is "+ (false || true));//true
		System.out.println("When false || false - esult is "+(false || false));//false
		
		System.out.println();
		
		System.out.println("##### truth table for ! (NOT) operator #####");
		System.out.println("When !true - result is " +(!true));
		System.out.println("When !false - result is "+(!false)); 
		
		
	}

}
