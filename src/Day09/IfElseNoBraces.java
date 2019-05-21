package Day09;

public class IfElseNoBraces {
	public static void main(String[] args) {
		String day="tuesday";
		
		if(day.equalsIgnoreCase("tuesday")) 
			System.out.println("Today is Tuesday");
		else
			System.out.println("Today is not Tuesday");
			System.out.println("Tuesday is not today");
			
			//Better advice to use Curly braces all the time
	}

}
