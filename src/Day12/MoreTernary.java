package Day12;

public class MoreTernary {
public static void main(String[] args) {
	String quality="bad";
	int rating=(quality.contentEquals("good")) ? 100:0;
	
	System.out.println("Rating: "+rating);
	
	int PMhour=6;
	
	boolean rushHour= (PMhour>=4 && PMhour<=7) ? true:false;
	System.out.println(PMhour + " is rush hour? "+rushHour);
	
	String result=rushHour==true ? "yes": "no";
}
}
