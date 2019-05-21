package Day46_Static;

public class Vehicle {
String type;
static int numberOfVehicles;

public static void vehicleInfo() {
	//System.out.println("type" + type);<== will not compile
	
	System.out.println("numberOfVehicles: "+numberOfVehicles);
	int count=getNumberOfVehicles();
	String make="Kia";
	make=make.toUpperCase();
	System.out.println("make"+make);
	
}
public static int getNumberOfVehicles() {
	return numberOfVehicles;
}
public String toString() {
	return "Vehicle type: "+type+" | count:"+numberOfVehicles;
}

}
