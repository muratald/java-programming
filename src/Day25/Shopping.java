package Day25;

public class Shopping {
	public static void main(String[] args) {
	String[] products= {"Timberland Shoes","H&M Shirt","Swatch Watch","Gucci Bag","Adidas Socks"};
	double[] prices= {120.0,5.99,150.50,3000.5,6.99};
	int[] itemsId= {12345,23456,33434,42123,11235};
	
	//Print count of products
	System.out.println("Products count: "+products.length);//5
	//check if products, prices and itemIds have same count
	if(products.length==prices.length && products.length==itemsId.length) {
		System.out.println("Shopping list looks good");
	}else {
		System.out.println("Something is wrong in this list");
		return;
	}
	
	//loop through products and print each one in separate line
	
	for(String product : products) {
		System.out.println(product);
	}
	
	//prices--> for loop
	
	
	for(int i=0;i<prices.length;i++) {
		System.out.println(prices[i]);
	}
	
	//itemsId--> print this in reverse order using a loop
	
//	System.out.println("Products count: "+);
//	System.out.println(itemsId[itemsId.length]);
	for(int i=itemsId.length-1;i>=0;i--) {
		System.out.println(itemsId[i]);
		
	//Print a report with a total price
	System.out.println("###### YOUR SHOPPING RECEIPT #####");
	double totalPrice=0.0;
	for(int idx=0; idx<products.length; idx++) {
		System.out.println("Item "+(idx+1)+": "+itemsId[i]+" - "+products[i]+" - $");
		
	}
		System.out.println("Total Price: $"+totalPrice);
		
	}
	//Find the most expensive items
	//loop and find.Do not use arrays
	int maxIndex=0;
	double maxPrice=0.0;
	
	for(int j=0;j<prices.length;j++ ) {
		if(prices[j]>maxPrice) {
			maxPrice=prices[j];
			maxIndex=j;
		}
	}
	System.out.println(itemsId[maxIndex]+" - "+products[maxIndex]+" - $"+maxPrice);
	
	
	
	
	
	
	
	
	
}

	
}
