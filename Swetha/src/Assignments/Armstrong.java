package Assignments;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int num,temp,total=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        //sc.nextLine();
        num=sc.nextInt();        
        while(num!=0){
            temp=num%10;
            total=total+temp*temp*temp;
            num/=10;
        }
        if (total==0)
        System.out.println(num+"is Armstrong");
        else
        System.out.println(num+"is not Armstrong");
        sc.close();
    }
    
}
