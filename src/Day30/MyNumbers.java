package Day30;

import java.util.Random;

public class MyNumbers {
public static void main(String[] args) {
	
	showMe5Numbers();
	showMe5Numbers();
	showMe5Numbers();
	showMe5Numbers();
	showMe5Numbers();

	while(true) {
		showMe5Numbers();

	}
	
	
}



public static void showMe5Numbers() {
	Random r = new Random();
	for(int i=0;i<=5;i++) {
		System.out.print(r.nextInt(1001)+" " );
		
		
	}
	
	System.out.println();
	
}
}
