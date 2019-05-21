package Day42_Classes;

public class myCoffees {
public static void main(String[] args) {
	Coffee coffee1=new Coffee();
	coffee1.name="Iced Caramel Macchiato";
	coffee1.price=4.75;
	coffee1.calories=250;

	
	Coffee coffee2=new Coffee();
	coffee2.setName("JAVA CHIP");
	coffee2.size="VENTI";
	coffee2.calories=600;
	
	coffee2.getCoffeeInfo();
	
	Coffee coffee3=new Coffee();
	coffee3.setName("IcEd Coffee");
	
}
}
