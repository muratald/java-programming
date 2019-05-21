package Day29;

import java.util.Arrays;

public class Cities {
	public static void main(String[] args) {
	String [][] countries= {{"USA",	"Washington DC"},
							{"Canada",	"Ottawa"},
							{"Mexico",	"Mexico city"},
							{"Brasil",	"Brasilia"},
							{"Peru",	"Lima"},
							{"Argentina",	"Boanes Aeros"},
							{"Bolivia",	"La Paz"},
							{"Macedonia",	"Scopia"},
							{"Kazakhstan",	"Nur-Sultan"}};
	
	System.out.println(countries[0][0]+"|"+countries[0][1]);
	System.out.println(countries[8][0]+"|"+countries[8][1]);
	System.out.println(Arrays.deepToString(countries));
	
	for(int i=0;i<countries.length;i++) {
		
		System.out.print(countries[i][0]+"|");
		
	}
	System.out.println();
	for(String[] c:countries) {
		System.out.print(c[0]+"|");
	}
	String[] cities = new String[countries.length];
	System.out.println(Arrays.toString(cities));
	
	for(int i=0;i<countries.length;i++) {
	cities[i]=countries[i][1];
	}
	System.out.println(Arrays.toString(cities));
			
	//look for Bolivia and test if capital city is La Paz
	
	for(int row=0;row<countries.length;row++) {
		if(countries[row][0].equals("Bolivia")) {
			//System.out.println(countries[row][1]);
		if(countries[row][1].equals("La Paz")) {
			System.out.println("Bolivia test passed");
		}else {
			System.out.println("Bolivia test failed");
		}
		break;
	}
}
	}
}