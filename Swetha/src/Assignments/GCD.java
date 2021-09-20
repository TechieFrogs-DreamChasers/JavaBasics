package Assignments;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int n1,n2,gcd=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for n1");
        n1=sc.nextInt();
        System.out.println("enter the value for n2");
        n2=sc.nextInt();

        for(int i=1;i<=n1&&i<=n2;++i){
            if(n1%i==0 && n2%i==0)
            gcd=i;
        }sc.close();
        System.out.println("GCD of n1 and n2 is:"+ gcd);
    
}
    
}
