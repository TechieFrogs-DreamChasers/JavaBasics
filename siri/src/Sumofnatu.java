import java.util.Scanner;

public class Sumofnatu {
    public static void main(String[] args) {
        int total = 0;

        
        
        
      Scanner oscanner=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        
       int num = oscanner.nextInt();
       
        oscanner.close();
        for(int count = 1; count <= num; count++){
            total = total + count;
        }

        System.out.println("Sum of first "+num+" natural numbers is: "+total);
    }
    }
    

