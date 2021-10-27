package TCSNQT;

import java.util.Scanner;

public class JAR{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Capacity of the Jar: ");
        int n = sc.nextInt();
        System.out.print("Number Of Candies Customer wants to Buy: ");
        int m = sc.nextInt();
        sc.close();

        int k = 0;

        getFull(n,m,k);

    }

     static void getFull(int n,int m,int k){
        if(m<=n){
            k = n-m;
            System.out.println(" Candies left in the Jar: "+ k);
            if(k < n/2){
                System.out.println("Since "+ k +" is less than half of the Jar So it is time to Refill ");
                n = k+m;
                System.out.println("After refill number of candies are: "+ n);
            }
        }else{
            System.out.println("Invalid Input");
        }
      
    }
   
}
