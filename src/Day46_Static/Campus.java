package Day46_Static;

import java.util.*;

public class Campus {
	private String city;
	static String country;

	static {
		System.out.println("static block");
		country="USA";
	}

	public Campus(String city) {
		System.out.println("Constructor");
		this.city=city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public static void campusInfo() {
		System.out.println();
	}
	
	
}


