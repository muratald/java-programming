package Day37_ArrayList;
import java.util.*;
public class RemoveInteger {
public static void main(String[] args) {
	ArrayList<Integer> nums = new ArrayList<>();
	System.out.println(nums.size());
	System.out.println(nums.isEmpty());
	System.out.println(nums.size() == 0);
	
	nums.add(4);
	nums.add(1);
	nums.add(443);
	nums.add(5);
	nums.add(10);
	nums.add(100);
	nums.add(55);
	
	System.out.println(nums.toString());
	nums.remove(5);
	
	System.out.println(nums.toString());
	
	Integer n1=new Integer(5);
	Integer n2=Integer.valueOf(5);
	
	nums.remove(n1);
}
}
