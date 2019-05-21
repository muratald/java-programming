package Day22;

public class SubstringPrctice {
	public static void main(String[] args) {
		String word="java";
		System.out.println(word.substring(0,1));
		System.out.println(word.substring(1,2));
		System.out.println(word.substring(2,3));
		System.out.println(word.substring(3,4));
		
		int i=0;
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		
		for(int n=0;n<=3;n++) {
			System.out.println(word.substring(n,n+1));
		}
		System.out.println("REVERSE");
		
		for(int m=3;m>=0;m--) {
			System.out.println(word.substring(m,m+1));
		}
	}

}
