package com.Practice.Casting;

public class ImplicitAndExplicit {
    public static void main(String[] args) {
        int a=10;
        float b= (float) 15.0;// explicit type casting
        float c=a;// implicit type casting
        char ch=65;
        double ab=50.5;
        short d=(short) a;
        byte e=(byte)d;
        int m=e;
        double result=(a-b)+(c*ch)+(ch-ab)+(d*e)+(e*m);//implicit casting
        int res=(int)((a-b)+(c*ch)+(ch-ab)+(d*e)+(e*m));//explicit casting
        System.out.println(result);//859.5
        System.out.println(res);//859
        long l=89000;
        int i=1000;
        int r= (int) (l+i);//explicit casting
        System.out.println(r);//90000

    }
}
