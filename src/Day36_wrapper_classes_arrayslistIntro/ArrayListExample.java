package Day36_wrapper_classes_arrayslistIntro;
import java.util.*;
public class ArrayListExample {
public static void main(String[] args) {
	// declare arrayList called Languages
	ArrayList <String> languages= new ArrayList<>();
	//add values
	languages.add("Java");
	languages.add("Python");
	languages.add("Ruby");
	languages.add("Latin");
	
	//languages.add(true);
	System.out.println("Number of values: "+languages.size());
	languages.add("qazaq");
	
	languages.remove(0);
	System.out.println("Number of values: "+languages.size());
	
	
	
	
	
	
	
}
}
