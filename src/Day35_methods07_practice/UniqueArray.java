package Day35_methods07_practice;

public class UniqueArray {
public static void main(String[] args) {
	int [] nums= {7,4,1,4,1,5,9,9,3};
	int [] arr= {12,23,23,3,43,23,4,12,32,32,12,2,4,32,4,23,3,3,34};
	lookForUnique(nums);
	
}
public static void lookForUnique(int[] nums) {
	for(int i=0;i<nums.length;i++) {
		int count = 0;
		int temp=nums[i];
		for(int j=0;j<nums.length;j++) {
			if(nums[j]==temp && i!=j) {
				count++;
			}
		}
		if(count==0){
			System.out.print(temp+" ");
		}
		
	}
}

















public static void findUnique(int[] nums) {
	for(int i=0;i<nums.length;i++) {
		int temp=nums[i];
		int count=0;
		for(int g=0;g<nums.length;g++) {
			if (nums[g]==temp && i!=g) {
				count++;
				break;
				
			}
		}
		if(count==0) {
			System.out.print(temp+" ");
	}
	
	}
}

public static void getUnique(int[] nums) {
	int unique=0;
	int count=0;
	for(int i=0;i<nums.length;i++) {
		 unique=nums[i];
		
		for(int g=0;g<nums.length;g++) {
			if (nums[g]==unique && i!=g) {
				count++;
				break;
				
			}
		}
		
		

}
	if(count==0) {
		
		System.out.println(unique);
}
}

}


