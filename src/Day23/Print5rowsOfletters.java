package Day23;
import java.util.*;
public class Print5rowsOfletters {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	
		for (int j = 0; j < 5; j++) {
			
			if(j%2==0) {
			for (char letter = 'a'; letter <= 'z'; letter++) {
				System.out.print(letter);
			
				for(char letter = 'z';letter>='a'; letter--) {
					System.out.println(letter);
				}
				System.out.println();

			}
			System.out.println("********************");
		}
		}

