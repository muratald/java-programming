package Day41;
import java.util.*;
public class WarmUp {
public static void main(String[] args) {
	List<Integer>myList=new ArrayList<>();
	myList.add(5);
	myList.add(6);
	myList.add(7);
	System.out.println(doubleTheList(myList));
	
}
public static List<Integer>doubleTheList(List<Integer>nums){
	for(int i=0;i<nums.size();i++) {
		nums.set(i,i]*2);
			
	}
}

}
