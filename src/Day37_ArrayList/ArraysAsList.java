package Day37_ArrayList;

import java.util.*;

public class ArraysAsList {
public static void main(String[] args) {
	List<String> cars=new ArrayList<>();
	cars.add("Honda");
	
	List<Integer> nums=Arrays.asList(4,2,5,7,8);
	System.out.println(nums.size());
	System.out.println(nums.toString());
	
	List<Double>prices=Arrays.asList(20.5,12.3,12.3,15.0,32.0,33.30,32.0,332.3,232.32,23.23);
	
	System.out.println(prices);
	
	double sum=0;
	for(double price:prices) {
		sum+=price;
	}
	System.out.println("Sum: "+sum);
	double sum2=0;
	for(int i=0;i<prices.size();i++) {
		sum2+=prices.get(i);
	}
	System.out.println(sum2);
	
	
	List<Double>expensive=new ArrayList<>();
	for(double price:prices) {
		if(price>100.0) {
			expensive.add(price);
		}
	}
	System.out.println("Expensive: "+expensive.toString());

	
}
}
