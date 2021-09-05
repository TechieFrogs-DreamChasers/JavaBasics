package Constructors;

public class ConstParameters {
    public ConstParameters(int i,int b){
        int num1 = i;
        int num2 = b;
        int sum = num1+num2;
        System.out.println(num1 + " + " + num2+" Sum :"+sum);
        }


    public static void main(String[] args){
        System.out.println("Given numbers are :");
        ConstParameters obj = new ConstParameters(18,158);
        
    }
    
    
}
