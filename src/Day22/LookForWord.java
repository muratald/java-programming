package Day22;

public class LookForWord {
	public static void main(String[] args) {
		String sentence="He said hi, then she replied hi. hi guys!";
		int n=0;
		System.out.println(sentence.substring(n,n+3));
		n+=3;
		System.out.println(sentence.substring(n,n+3));
		n+=3;
		System.out.println(sentence.substring(n,n+3));
		n+=3;
		System.out.println(sentence.substring(n,n+3));
		n+=3;
		int count=0;
		for(int i=0;i<sentence.length();i++) {
			String temp=sentence.substring(i,i+2);
			
//			System.out.println(temp);
			if(temp.equals("hi")) {
				count++;
			}
		}
		
		
	}

}
