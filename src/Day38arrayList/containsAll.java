package Day38arrayList;

import java.util.*;

public class containsAll {
	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<>();
		list1.add("Jan");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");


		 System.out.println(list1.toString());
	        ArrayList<String> list2 = list1;//list1, list2 point to same object 
	        //copy all values from list1
	        ArrayList<String> months = new ArrayList<>(list1);
	        System.out.println(months);
	        months.add("Jun");
	        months.add("Jul");
	        months.add("Aug");
	        
	}
}
