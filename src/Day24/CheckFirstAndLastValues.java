package Day24;

public class CheckFirstAndLastValues {
	public static void main(String[] args) {
		int[] numbers= {12,41,213,21,42,12};
		boolean equals=numbers[0]==numbers[numbers.length-1];
		System.out.println(equals);
		
	}

}
