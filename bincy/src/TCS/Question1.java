package TCS;

import java.util.Scanner;

public class Question1 {
    public static int n;
    public static int k;

    public static void main(String [] args){
        


        System.out.println("Want to buy candies?(yes/no) ");
        Scanner obj = new Scanner(System.in);
        String reply = obj.nextLine();
        n=10;
        if(reply.equals("yes")){
            System.out.println("Number of candies available: "+ n);
            char ch;
            do{
            System.out.print("Enter the number of candies: ");
            int num = obj.nextInt();
            buy(num);
            System.out.print("Do you want to buy more? (y/n): ");
            ch=obj.next().charAt(0);
            }while(ch == 'y');
        }
        else{
            System.out.println("Thank you ");
        }
        obj.close();

    }
    public static int refill(int n){
        n=10;
        return n;
    }
    public static void buy(int num){
        if(num!=0 && num<n){
            System.out.println("Number of candies sold: "+num);
            k= n-num;
            if(k<5){
                n = refill(n);
            }
        }
        else{
            System.out.println("Invalid input.");
        }
            n=n-num;
            System.err.println("Number of candies available: "+n);
        
    }
}
