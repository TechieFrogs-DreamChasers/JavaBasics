package com.TcaNqit.Coding;

import java.util.Scanner;

//We want to estimate the cost of painting a property.
public class Question5 {
    public static void main(String[] args) {
        System.out.println("Enter Number of Interior walls: ");
        Scanner sc=new Scanner(System.in);
        int no_Int_Walls = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Number of Exterior walls: ");
        int no_Ext_Walls = sc.nextInt();
        sc.nextLine();
        float intPaint_Cost = 18.0f;
        float extPaint_Cost = 12.0f;
        //square feet of that wall
        float temp;
        float total_Cost = 0.0f;
        //condition check for negative values
        if(no_Int_Walls < 0 || no_Ext_Walls < 0){
            System.out.println("INVALID INPUT");
        }
        //condition check for Zero values
        else if (no_Int_Walls == 0 || no_Ext_Walls == 0){
            System.out.println("Total Estimated Cost: 0.0 INR");
        }
        //> 0 wall values
        else {
            //Looping through interior walls
            for(int i=0;i<no_Int_Walls;i++){
                //wall square feet reading through console
                temp= sc.nextFloat();
                sc.nextLine();
                //adding the cost for interior walls
                total_Cost+=intPaint_Cost*temp;
            }
            //Looping through exterior walls
            for(int i=0;i<no_Ext_Walls;i++){
                //wall square feet reading through console
                temp= sc.nextFloat();
                sc.nextLine();
                //adding the cost for exterior walls
                total_Cost+=extPaint_Cost*temp;
            }
            //total cost=interior+exterior
            System.out.println("Total Estimated Cost: "+total_Cost);
        }

        sc.close();
    }
}
/*
Enter Number of Interior walls:
6
Enter Number of Exterior walls:
3
12.3
15.2
12.3
15.2
12.3
15.2
10.10
10.10
10.00
Total Estimated Cost: 1847.3999
 */