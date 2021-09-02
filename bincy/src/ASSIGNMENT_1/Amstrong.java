package ASSIGNMENT_1;
import java.util.Scanner;

public class Amstrong {// 16.Amstrong number
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner obj = new Scanner(System.in);
        int num=obj.nextInt();
        obj.close();
        int temp=num;
        int sum=0;
        while(temp > 0){
            int r = temp % 10;
            temp= temp/10;
            sum=sum+(r*r*r);

        }
        if(sum == num)
            System.out.println("The number is Amstrong number.");
        else
            System.out.println("The number is not Amstrong number.");
    }
}
