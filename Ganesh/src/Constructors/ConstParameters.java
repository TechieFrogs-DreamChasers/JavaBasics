package Constructors;

public class ConstParameters {
    int num1;
    int num2;
    int sum;
    public ConstParameters(int i,int b){
        num1 = i;
        num2 = b;
        sum = num1+num2;
     //   System.out.println(num1 + " + " + num2+" Sum :"+sum);
        }
    void display(){
        System.out.println("Sum of numbers :"+sum);
    }


    public static void main(String[] args){
       // ConstParameters s1 = new ConstParameters();
       // System.out.println("Given numbers are :");
        ConstParameters obj = new ConstParameters(18,158);   
        obj.display();    
    }
       
}
