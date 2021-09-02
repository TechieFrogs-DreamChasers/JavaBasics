import java.util.Scanner;

public class assignment4 {
    public static void main(String [] args){
        Scanner sacnnerObj = new Scanner(System.in);
              System.out.println("Enter the Number");
        int x = sacnnerObj.nextInt();
       /* if(x%2==0)
            System.out.println("It's Even Number");
        
        else 
                 System.out.println("It's Odd Number");
        sacnnerObj.close();*/
             String output=(x%2==0)?"even number" : "odd number";
              System.out.println(output);
        sacnnerObj.close();

            
        }

    }
    

