package Day23;
import java.util.*;
public class BruteForce {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String expectedUserName="admin";
		String expectedPassword="admin123";
		String username="";
		String password="";
		int attemts=5;
		do {
			if(attemts==0) {
				System.out.println("You have exceeded number of attemts");
				System.out.println("This user has been deactivated ");
				return;
			}
			attemts--;
			System.out.println("Please enter user name");
			username=scan.next();
			if(!username.equals(expectedUserName)) {
				System.out.println("Wrong user name");
				System.out.println("Attemts left: "+attemts);
				continue;
			}
			System.out.println("Please enter password");
			password=scan.next();
			if(!password.contentEquals(expectedPassword)) {
				System.out.println("Wrong password");
				System.out.println("Atemts left: "+attemts);
				continue;
			}
			
		}while(!username.equals(expectedUserName) || !password.contentEquals(expectedPassword));
		System.out.println("Login successful!");
		
	}

}
