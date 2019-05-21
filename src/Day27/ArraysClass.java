package Day27;
	import java.util.*;
public class ArraysClass {
public static void main(String[] args) {
	int[] nums= {43, 12, 4, 3, 5};
	System.out.println(Arrays.toString(nums));
	String str= Arrays.toString(nums);
	System.out.println(str);
	
	//sort method
	Arrays.sort(nums);
	System.out.println(Arrays.toString(nums));
	String[] languages= {"English","Italian","Catalan","Spanish","Zulu"};
	
	Arrays.sort(languages);
	System.out.println(Arrays.toString(languages));
	
	int[] nums2= {345, 665, 333, 11, 3, 6};
	//find lowest to largest values from nums2 array
	
	Arrays.sort(nums);
	int lowest=nums2[0];
	int largest = nums2[5];
	
	
	
	
	
}
}
