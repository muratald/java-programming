package Day27;

import java.util.Arrays;

public class copyCertainValues {
public static void main(String[] args) {
	System.out.println("-----EXAMPLE RUN ---------");
    String[] numbers = {"zero", "one", "two","three","four"};
    System.out.println(Arrays.toString(getWithE(numbers)));
    
  }
  
  
  
  public static String[] getWithE(String[] arr) {
    
    //TODO : YOUR CODE GOES HERE ----------------------
    int count=0;
    for(int i=0; i<arr.length;i++) {
    	if(arr[i].contains("e")){
    		count++;
    	}
    			
    }
    
    int adik=0;
    String [] fewValues= new String[count];
    for(int i=0; i<arr.length;i++) {
    	fewValues[adik++]=arr[i];
    }
    
    
    //YOUR CODE ENDS HERE -----------------------
    
    return fewValues;
}
}
