package Day41;

public class Car {
	static String make;
	String model;
	static int currentSpeed;
	String color;
	
public void printCarInfo() {
	
	System.out.println("car make["+make+"], "+"model["+model+"], "+"color["+"], "+color);
	
}
public static void showCurrentSpeed(int speedLimit) {
	if(currentSpeed<=speedLimit) {
	System.out.println(make+"is driving at"+currentSpeed+"mph");
}else {
	System.out.println("over the limit");
}

}
public void accelerate(int mph) {
	currentSpeed+=currentSpeed+mph;
	
	
}

}