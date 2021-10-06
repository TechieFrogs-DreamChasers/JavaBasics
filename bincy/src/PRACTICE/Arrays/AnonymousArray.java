package PRACTICE.Arrays;

import java.util.StringJoiner;

public class AnonymousArray {
    public static void main(String[] args){
        printArray(new int[]{2,5,6,7,8});
        StringJoiner s = new StringJoiner(", ");   //StringeJoiner object  
	        s.add("Hello");    //String 1   
	        s.add("World");    //String 2  
	        System.out.println(s.toString());  //Displays result  
    
    
    }

    public static void printArray(int []a){
        for(int i: a){
            System.out.println(i);
        }
    }
      
	        
	     

}
