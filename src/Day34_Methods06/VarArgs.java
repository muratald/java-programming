package Day34_Methods06;

import java.util.Arrays;

public class VarArgs {
public static void main(String... args) {
	printWords("red","blue");// 3 values
	printWords("grey");//one value
	printWords();//empty , so array will be empty
	System.out.println(sum(3,3,2,12,3));
	System.out.println(sum(365,365,365,364));
	int budget=200;
	sum(10,45,110,30,5);
	
	if(sum(10,45,110,30) <= budget) {
		System.out.println("Within budget");
	}else {
		System.out.println("Broke");
	}
	
	int total=sum(234,3,2,3,223,23,2,2);
	System.out.println("total "+total);
	
	cook("Burrito","Brown Rice","Pinto Beans","Chicken");
	shoppingList(1000,"gucci hat","shirt");
	
	String[] myPets= {"cat","horse","chicken","sheep","goat"};
	printWords(myPets);
	
}

public static void printWords(String... words) {
	for(String w:words) {
		System.out.println(w);
	}
}
	public static int sum (int... nums) {
		int sum=0;
		for(int n:nums) {
			sum+=n;
		}
		return sum;
	}

	public static void cook(String name, String... ings) {
		System.out.println("Food: "+name);
		System.out.println(Arrays.toString(ings));
		
	}
	public static void shoppingList(int price, String... items) {
		System.out.println("Total cost: "+price);
		System.out.println(Arrays.toString(items));
	}
	
}

