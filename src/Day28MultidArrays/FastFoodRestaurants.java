package Day28MultidArrays;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
public class FastFoodRestaurants {
	public static void main(String[] args) throws IOException {
	String[] data=Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
	
	System.out.println("Data size: " + data.length);
	
	System.out.println(data[0]);
	System.out.println(data[1]);
	//print last restaurant
	System.out.println(data[data.length-1]);
	
	System.out.println(Arrays.toString(data));
		
	//print each Restaurant info in separate line 
	int counter=0;
	for(String restaurant:data) {
		System.out.println("#"+counter +"=>"+restaurant);
		counter++;
	}
	//Print all restaurant info in state of VA
	//and print the number
	int count=0;
	for(String row:data) {
		if(row.contains(",VA,")) {
			String[] rowArr=row.split(",");
			System.out.println(rowArr[2]+ " - "+rowArr[1]);
		}
	}
	
	
	
	//Find all restaurant info in state of VA
	//Print the restaurant names along with cityname
	//Subway - Herndon
	
	
	
		
		
		
		
	}
}
