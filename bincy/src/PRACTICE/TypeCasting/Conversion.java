package PRACTICE.TypeCasting;

import java.util.IllegalFormatException;

public class Conversion {
    public static void main(String[] args){
        String s ="1234";
        int j =20;
        int i = Integer.parseInt(s);
        System.out.println(i);
        s= "3456";
        i = Integer.valueOf(s);
        System.out.println(i);
        s= Integer.toString(i);
        System.out.println(s);
        System.out.println(Integer.valueOf(i)); 
        System.out.println( String.format("%d %d", i,j));
        String str;
        try{
         str = String.format("%f", j);
        }catch(IllegalFormatException ie){
             str = String.format("%d",j);
            System.out.println(str);
        }
        Integer m =new  Integer(100);
        int m1 = m;//wrapper class object to primitive variable--unboxing
        System.out.println(m1);
        m=10;
        Integer m2 = m;//Boxing
        System.out.println(m2);

    }
}
