package Day14;
import java.util.*;

public class assignments {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
    
    //YOUR CODE HERE
   
    
    System.out.println("Enter word:");
    String word = scan.next();
   
    if(word.length()%2==1 && word.length()>=3){
      
      System.out.println(word.charAt(word.length()/2));
    } else if (word.length()==1) {
      System.out.print(word);
      System.out.print(word);
      System.out.print(word);
    }else if(word.length()%2==0 && word.length()>=4) {
    	System.out.println(word.charAt((word.length()/2)-1)+""+word.charAt(word.length()/2));
    }else if(word.length()==2) {
    	System.out.print(word);
    	System.out.print(word);
    }
    
}
}
