package Day12;
import java.util.*;
public class ass {
public static void main(String[] args) {
		   
	
        Scanner scan=new Scanner(System.in);
        System.out.println("Which type ofcar are you interested in?");
        System.out.println("1)American\n2)Japanes\n3)German\n4)Italian\n5)Korean");
        int carType=scan.nextInt();
        int averagePrice;
        String carOptions,carOrigin;

        switch(carType) {
        case 1:
        	averagePrice=33000;
        	carOptions= "Ford, Dodge, Tesla, Chevrolet, Lincoln";
        	carOrigin="American";
        	break;
        case 2:
        	averagePrice=32000;
        	carOptions="Toyota,Mitsubisi,Honda, Subaru, Mazda";
        	carOrigin="Japanese";
        	break;
        case 3:
        	averagePrice=55000;
        	carOptions="BMW,VW, Audi, Mercedes, Porsche";
        	carOrigin="German";
        	break;
        case 4:
        	averagePrice=85000;
        	carOptions="Alfa Romeo, Ferrari, Lamborghini, Fiat";
        	carOrigin="Italian";
        	break;
        case 5:
        	averagePrice=2500;
        	carOptions="Kia, Hyundai, Daewoo";
        	carOrigin="Korean";
        	break;
        	default:
        		System.out.println("Car type not available");
        		return;
        	 }
	    System.out.println("You selected "+carOrigin+"car and your options are"+carOptions+".");
        System.out.println("Average price: "+averagePrice);
        
}   
  
}

