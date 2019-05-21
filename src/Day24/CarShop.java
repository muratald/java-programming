package Day24;

public class CarShop {
	public static void main(String[] args) {
		String [] cars= {"BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"};
		for(String c: cars) {
			if(!c.startsWith("M")){
				continue;
			}
			System.out.println(c);
		}
		System.out.println("***********");
		for(String make:cars) {
			if(make.toLowerCase().contains("r")) {
				System.out.println(make);
			}
		}
		System.out.println("************");
		for(String b: cars) {
			if(!b.endsWith("a")){
				System.out.println(b);
			}
		
		}
		System.out.println("*************");
		for(String make:cars) {
			if(make.length()>5) {
				System.out.println(cars);
			}
		}
		
		
		
	}	
	}

