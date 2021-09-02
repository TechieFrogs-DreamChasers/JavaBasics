package PRACTICE;

public class Check{
    public static void main(String[] args){
        int num=6;
        
        if( num > 0){
            System.out.println("The number is positive"); 
        }
        else{
            System.out.println("The number is positive");
        }
        if ((num%2)==0)  
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
        
        String out=(num>0)?("Positive number"):("Negative number");
        System.out.println(out);    
    }
}