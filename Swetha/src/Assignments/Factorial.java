package Assignments;
public class Factorial {
    public static void main(String[] args) {
        int i,fact=1;
        int number=5;//This is the number to caluculate Factorial
        
        for(i=1; i<=number; ++i) {
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is:"+fact);

    }
    
}
