package Day32;

public class MethodInsideMethod {
public static void main(String[] args) {
	makePancakes();
	makePasta();
	makePancakes();
	cook("Omelette", "Eggs, Salt,Tomatoes,Green Peppers, ");
}
public static void cook(String dish, String ingredients) {
	System.out.println("~~"+dish.toUpperCase()+" Recipe~~");
	add(ingredients);
	System.out.println("Cook until it's cooked");
	System.out.println("~~"+dish.toUpperCase()+" IS READY~~");
}

public static void makePasta() {
	
	System.out.println("~~Italian pasta recipe~~");
	add("Milk,Eggs,Flour,Sugar,Salt");
	boil(2);
	add("Spaghetti Pasta");
	boil(9);
	mix(60);
	System.out.println();
}


public static void makePancakes(){
	System.out.println("!!PANCAKES RECIPE~~");
	add("Milk, Eggs, Flour, Sugar, Salt");
	mix(120);
	fry(3);
	System.out.println("Enjoy!");
}

public static void add(String item) {
System.out.println("Add "+item);

}

public static void mix(int seconds) {
	System.out.println("Mix for "+seconds+" seconds");
}

public static void fry(int minutes) {
	System.out.println("Fry for "+minutes+" minutes");
}

public static void boil(int minutes) {
	System.out.println("Boil for "+minutes+" minutes");
}

}
