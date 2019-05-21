package Day22;

public class CatsAndDogs {
	public static void main(String[] args) {
	int dogs=0;	
	int cats=0;
	int j=0;
	String str="mycatyourcatdog";
	for(int i=0;i<=str.length()-3;i++) {
		System.out.println(str.substring(i,i+3));
		if(str.substring(i,i+3).equals("cat")){
			cats++;
		}
		if(str.substring(j,j+3).equals("dog")){
			dogs++;
		}
		
	
	}
	System.out.println("Cats: "+cats);
	System.out.println("Dogs "+dogs);
	}
}
