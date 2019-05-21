package Day30;

public class Students {
public static void main(String[] args) {
study("HTML");
study("Selenium");
sleep(5);
sleep(5);

}


public static void study(String topic) {
	System.out.println("Student is studying "+topic);
}
public static void sleep(int hours) {
	System.out.println("Student has been sleeping for "+hours+" hours.");
	
	
}	

}
