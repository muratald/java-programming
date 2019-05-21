package Day11;
import java.util.*;
public class TollCaculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Vehicle Type:");
		int carType=scan.nextInt();
		
		System.out.println("Is it rush hour: yes|| no");
		String rushHour=scan.next();
		boolean isRushHour;
		if(rushHour.equalsIgnoreCase("yes")) {
			isRushHour=true;
		}else {
			isRushHour=false;	
		}
		//System.out.println(isRushHour);
		double price=0.0;
		if (carType==1) {
			if(isRushHour) {
				price = 30.0;
			}else {
				price=5.0;
			}
			
		}else if(carType==2) {
			if(isRushHour) {
				price=55.30;
			}else {
				price=15.99;
			}
		}
		
		System.out.println("Toll cost: "+price);
		
	}

}
