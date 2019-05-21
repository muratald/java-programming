package Day37_ArrayList;
import java.util.*;
public class MyCities {
	public static void main(String[] args) {
	ArrayList<String>cities=new ArrayList<>();
	cities.add("Dushanbe");
	cities.add("New York");
	cities.add("Baku");
	cities.add("Bishkek");
	cities.add("Sterling");
	cities.add("Arlington");
	cities.add("Baku");
	
	
	//print cities using for each loop
	
	for(String city:cities) {
		System.out.println(city+" ");
		
	}
	System.out.println();
	
	for(int i =0; i<cities.size();i++) {
		System.out.println(cities.get(i)+" ");
	}
		//remove Baku
	cities.remove("Baku");
	
	System.out.println(cities.toString());
	
	
	cities.add(0,"Bishkek");
	System.out.println(cities.toString());
	cities.add(1,"New York");
	System.out.println(cities.toString());
	
	cities.set(2, "Seoul");
	System.out.println(cities.toString());
	
	int idx=cities.indexOf("Sterling");
	System.out.println("index: "+idx);
	
	cities.set(idx, "Zagreb");
	
	System.out.println(cities.toString());
	
	cities.clear();
	boolean empty=cities.isEmpty();
	System.out.println("empty: "+empty);
	
	
	
	
	
	
}
}
