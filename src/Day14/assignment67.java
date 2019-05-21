package Day14;
import java.util.*;
public class assignment67 {
	 public static void main(String[] args) {
		   
		    
		   
		        //DO NOT CHANGE
		 Scanner scan = new Scanner(System.in);
		  
		    String word = "";
		   
		    
		    //YOUR CODE HERE
		    System.out.println("Enter word:");
		     word = scan.nextLine();
		   
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
		    	
		    
		    
		    
		    


