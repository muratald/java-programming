package Day16StringManipulation;

public class ExtraEnd {
	public static void main(String[] args) {
		String str="water";
		String result="";
		if(str.length()==2) {
			result=str+str+str;
		}else {
			result=str.substring(str.length()-2);
			result=result+result+result+result;
		}
		System.out.println(result);
		
	}

}
