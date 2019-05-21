package Day28MultidArrays;

import java.util.Arrays;

public class rows3 {
public static void main(String[] args) {
	int[][] nums=new int[3][4];
	nums[0][0]=100;
	nums[0][1]=34534;
	nums[0][2]=1234;
	nums[0][3]=3454;
	
	nums[1][0]=334;
	nums[1][1]=31534;
	nums[1][2]=35534;
	nums[1][3]=37534;
	
	nums[2][0]=346734;
	nums[2][1]=34654;
	nums[2][2]=345434;
	nums[2][3]=345234;
	
	System.out.println(Arrays.deepToString(nums));
	
	System.out.println(Arrays.toString(nums[0]));
	
	int[][] scores= { {3,5,10}, {6,4,2,10} };
	
	System.out.println("Days played/Number of arrays: "+scores.length);
	System.out.println("Number of values in 1: " + scores[0].length);
	System.out.println("Number of values in 2: " + scores[1].length);
	
	int[][] values=new int [4][];
	values[0]= new int[] {34,23,5};
	
	values[1]=new int[] {3,5,6,7,8,0,67};
	
	values[2]=new int[2];
	values[2][0]=55;
	values[2][1]=44;
	
	values[3]=new int[] {45,34,23,12,4};
	
	System.out.println(Arrays.deepToString(values));
	
	
	
	
	
	
	
	
	

	
}
}
