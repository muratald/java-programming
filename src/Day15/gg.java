package Day15;
import java.util.*;
public class gg {
public static void main(String[] args) {
	
	String list = "html-selenium-angular-jenkins-grid";
	int firstDash=list.indexOf("-");
	System.out.println("First dash:"+firstDash);
	
	int secondDash=list.indexOf("-", 5);
	
	System.out.println("second dash:"+secondDash);
	
	int thirdDash=list.indexOf("-", secondDash+1);
	System.out.println("Third dash:"+thirdDash);
	
	
}
}
