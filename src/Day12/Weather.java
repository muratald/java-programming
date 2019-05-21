package Day12;
import java.util.*;
public class Weather {
	public static void main(String[] args) {
	Scanner scan= new Scanner (System.in);
	String weather;
	
	System.out.println("Enter weather type");
	weather=scan.next();
	
	switch(weather) {
	case "sunny":
		System.out.println("Go to Park");
		System.out.println("Code Java");
		break;
	case "hot":
		System.out.println("Go Swimming");
		System.out.println("Code Java");
		break;
	case "windy":
		System.out.println("Fly a Kite");
		System.out.println("Code Java");
		break;
	case "rainy":
		System.out.println("Go shopping");
		System.out.println("Code Java");
		break;
	case "snow":
		System.out.println("Go skiing");
		System.out.println("Code Java");
		break;
	default:
		System.out.println("Code Java in any other weather");
	}
	
	 
	}
}
