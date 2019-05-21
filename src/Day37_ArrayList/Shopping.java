package Day37_ArrayList;
import java.util.*;
public class Shopping {
public static void main(String[] args) {
	ArrayList <String> items=new ArrayList<>();
	items.add("hat");
	items.add("cleats");
	items.add("shirt");
	items.add("pants");
	items.add("boots");
	items.add("jeans");
	
	int count=items.size();
	System.out.println("count: "+count);
	
	System.out.println(items.toString());
	//first and last item in single line
	System.out.println(items.get(0));
	System.out.println(items.get(5));
	
	items.remove("shirt");
	items.remove("cleats");
	System.out.println(items);
	System.out.println(items);
	int counts=items.size();
	System.out.println("counts: "+counts);
	
	items.remove(0);
	System.out.println(items.toString());
	
	//we cannot modify list inside for each loop
	for(String item:items) {
		System.out.println(item);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
