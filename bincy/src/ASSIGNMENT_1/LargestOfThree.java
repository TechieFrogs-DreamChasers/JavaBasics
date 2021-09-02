package ASSIGNMENT_1;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args){
        int a,b,c,largest;
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        c = obj.nextInt();
        obj.close();
        if (a >= b )
            if(a >= c)
                largest = a;
            else
                largest = c;
        else
            if(b>=c)
                largest = b;
            else    
                largest = c;
        System.out.println("Largest of "+ a +" "+ b+" " + c + " is " + largest);
    }
}
