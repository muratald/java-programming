package Day46_Static;

public class Restaurant {
public static void main(String[] args) {
	Dinner Mom=new Dinner();
	Dinner kid=new Dinner();
	Dinner Dad=new Dinner();
	
	System.out.println("Total slices: "+Dinner.pizzaSlices);
	
	Dad.takeASlice();
	kid.takeASlice();
	Mom.takeASlice();
	
	System.out.println("total slices: "+Dinner.pizzaSlices);
	System.out.println("Total slices: "+Dinner.pizzaSlices);
	
	kid.takeASlice(3);
	Dad.takeASlice(1);
	Mom.takeASlice(1);
	
	System.out.println("total slices: "+Dinner.pizzaSlices);
	
	
}
}
