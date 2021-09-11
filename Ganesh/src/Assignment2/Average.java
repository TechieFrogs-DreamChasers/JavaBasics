package Assignment2;

import java.util.Scanner;

public class Average {
    int a,b,c,avg;
    public void getData(){
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();  
        sc.close();   
    avg = (a+b+c)/3;
    }

    void display(){
        System.out.println("Average of number a,b,c : "+avg);
    }
    public static void main(String[] args){
        System.out.println("Enter 3 Interger Values : ");
        Average AverAge = new Average();
        AverAge.getData();
        AverAge.display();
    }
}
