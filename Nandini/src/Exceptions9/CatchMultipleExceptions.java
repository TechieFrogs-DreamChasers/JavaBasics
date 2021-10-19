package Exceptions9;

import java.util.Arrays;
import java.util.Scanner;


public class CatchMultipleExceptions {
    public static void main(String[] args) {
        
        //one method
        /*System.out.println("Enter an First Integer: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter an second Integer: ");
        int n2 = sc.nextInt();
        sc.nextLine();
        int n3 = 0;*/

        //second method
        int[] array = {2,5,6,8,4};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an index value to print the array value ");
        int i = sc.nextInt();
        
        try {
                /*if (n2 > 0)
                    n3 = n1 / n2;*/
                
                if(i<array.length){
                    System.out.println("Array value at index "+ i +" is "+ array[i]);
                }
                else
                    throw new ArrayIndexOutOfBoundsException();

                    //throw new ArithmeticException("Number can't be divided by zero ");
                    //System.out.println("The Value of n3 is : " + n3);

        } catch (ArithmeticException e) {
            System.err.println("Number can't be divided by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Length problem ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
