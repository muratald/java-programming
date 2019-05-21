package Day39;

import java.util.*;

public class Cities {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();

		cities.add("Tokyo");
		cities.add("New York");
		cities.add("Paris");
		cities.add("Pittsburgh");
		cities.add("Berlin");
		cities.add("Madrid");
		cities.add("Moscow");
		cities.add("Istanbul");
		cities.add("Washington D.C.");
		cities.add("Amsterdam");
		cities.add("Zurich");
		cities.add("Singapore");
		cities.add("Milan");
		cities.add("Toronto");
		cities.add("London");

		for (String city : cities) {
			System.out.print(city + "|");
		}
		System.out.println();
		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i) + "|");
		}
		System.out.println();

		// 3) ToString. Print each city all uppercase
		System.out.println(cities.toString().toUpperCase());
		System.out.println(cities);

		// 3)Make each city all uppercase
		String paris = cities.get(0).toUpperCase();
		cities.set(0, paris);
		System.out.println(cities.get(0));
		System.out.println();

		cities.set(1, cities.get(1).toUpperCase());

		cities.set(7, "Lima");
		for (String city : cities) {
			System.out.print(city + "|");
		}

		// Find the longest city and shortest.

		String longestCity = "", shortestCity = "";
		for (String city : cities) {
			if (city.length() > longestCity.length()) {
				longestCity = city;

			}
		}
		shortestCity = cities.get(0);

		for (String city : cities) {
			if (city.length() < shortestCity.length()) {
				shortestCity = city;
			}
		}
		System.out.println();
		System.out.println("longestCity: " + longestCity);
		System.out.println("shortestCity: " + shortestCity);

		// Assign all cities that have more than 6 chars to this arraylist
		ArrayList<String>citiesMoreThan6=new ArrayList<>();
		for(String ct:cities) {
			if (ct.length()>6){
				citiesMoreThan6.add(ct);
			}
		}
		
	}
}
