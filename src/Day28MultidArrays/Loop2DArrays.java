
package Day28MultidArrays;

import java.util.Arrays;

public class Loop2DArrays {
	public static void main(String[] args) {
	String[][] pizzas= {
					{"pineapple","pepperoni",},
					{"anchovies", "mushroom","olives"},
					{"4 cheese"},
					{"chicken","tomatoes","jalapenios","onions"},//3
					{"green peppers", "zucccini","brocolli","spinach","shrimp"}
					};
	
	//System.out.println(Arrays.toString(pizzas));
	for(String[] pizza:pizzas) {
		System.out.print(pizza.length+"-");
		System.out.println(Arrays.toString(pizza));
	}
	
	System.out.println("##### FOR LOOP ######");
	for(int i=0;i<pizzas.length;i++) {
		System.out.print(pizzas[i].length+"-");
		System.out.println(Arrays.toString(pizzas[i]));
	}
	for(String toppings:pizzas[4]) {
		System.out.println(toppings);
	}
	
	int[][] students= {{4,5,6},
					{12,5,7},
					{23,56,12,55,3}
					};		
	//2 parts: outer loop, inner loop
	//outer loop will tke each group
	//inner loop will take each value/student id
	for(int[] group : students) {
		for(int studentId:group) {
			System.out.print(studentId+", ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
}
}
