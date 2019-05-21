package Day33Methods;

public class AgeCalculator {
public static void main(String[] args) {
	
	int age=calculateAge(1993);
	System.out.println("You are "+age+" years old");
}

public static int calculateAge(int year) {
	
	int age=2019-year;
	
	if(age<0){
		System.out.println("invalid age");
		return 0;
	}else if(age>=0&&age<=14) {
		System.out.println("child");
	}else if(age>=15 && age<=25) {
		System.out.println("Youngster");
	}else if(age>=26 && age<=64) {
		System.out.println("adult");
	}else {
		System.out.println("senior");
	
	}
	return age;
}
}
