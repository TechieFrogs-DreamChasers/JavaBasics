import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args){
        int n1 , n2  , sum ;
        Scanner myObj = new Scanner(System.in);
        System.out.println(" Enter First number :");
        n1 = myObj.nextInt();
        System.out.println(" Enter second number :");
        n2 = myObj.nextInt();
        sum = n1 + n2;
        System.out.println( " Sum of Numbers is : " +sum);

    }
    
}
