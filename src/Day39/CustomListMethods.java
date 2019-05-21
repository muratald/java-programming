package Day39;
import java.util.*;
import java.util.Random;
public class CustomListMethods {
	public static void main(String[] args) {
		ArrayList<Integer>numslist=new ArrayList<>();
		numslist.add(12);
		numslist.add(23);
		numslist.add(44);
		numslist.add(123);
		printList(numslist);
		
		
		List<Double> nums2 = new ArrayList<>();
	    nums2.add(44.2);
	    nums2.add(11.3);
	    nums2.add(22.2);
	    nums2.add(55.1);
	    nums2.add(66.4);
	    sumList(nums2);
	    System.out.println(sumList(nums2));
	    System.out.println(getlist(10));
	    System.out.println(getRandomList(20));
	    System.out.println();
	    List<Integer> rList=getRandomList(10);
	    Collections.sort(rList);
		System.out.print(rList);
		
		printList( (ArrayList<Integer>) getRandomList(7));
		
		List<String> strNums = new ArrayList<>();
		strNums.add("123");
		strNums.add("33");
		strNums.add("128");
		strNums.add("3");
		
		List<Integer> converted = convertToIntList(strNums);
		System.out.println(converted);
	}
	
public static void printList(ArrayList<Integer> nums ) {
	for(Integer i:nums) {
		System.out.println(i+" ");
	}
	System.out.println();
	
}
public static double sumList(List<Double> dList ) {
	double sum=0.0;
	for(double d: dList) {
		sum+=d;
		
	}
	return sum;
}
public static ArrayList<Integer> getlist(int size){
	ArrayList<Integer> newList=new ArrayList<>();
	for(int i=1;i<=size;i++) {
		newList.add(i);
	}
	return newList;
}

public static List<Integer> getRandomList(int size){
	Random n=new Random();
	ArrayList<Integer>list=new ArrayList<>();
	
	for(int i=1;i<=size;i++) {
		list.add(n.nextInt(101));
		
	}
	return list;
}
public static List<Integer> convertToIntList(List <String> strList){
	
	List<Integer>newList=new ArrayList<>();
	for(String str:strList) {
		newList.add(Integer.parseInt(str));
	}
	return newList;
	
	
	
	
}
}
