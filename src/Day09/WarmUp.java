package Day09;
import java.util.Scanner;
public class WarmUp {
	public static void main(String[] args) {
		int seniorCitizens,nonSeniorCitizens,age;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter current count for for seniorCitizens and nonSeniorCitizens:");
		seniorCitizens=scan.nextInt();
		nonSeniorCitizens=scan.nextInt();
		
		System.out.println("What is new citizen's age?");
		age=scan.nextInt();
		
		if(age>=65) {
			System.out.println("Senior Citizen");
			seniorCitizens ++;
	
		}else {
			System.out.println("non-Senior Citizen");
			nonSeniorCitizens ++;
		}	
			System.out.println("New seniorCitizens countValueOfVariable"+seniorCitizens);
			System.out.println("New nonSeniorCitizens count ValueOfVariable");
			
		}
				
	}

