package Day23;
import java.util.*;
public class Loop1to50 {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	for(int i =1;i<=50;i++) {
		
		if(i%20==0) {
			break;
	}
		if(i%5==0) {	
			continue;
		}
		System.out.print(i+",");
	}
	
}
}
