import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

public class Operators{
    public static void main(String[] args) {
        int i = 10;
        int j = 5;     
        /* i++; //i=i+1 post increment
        i--; //i=i-1 post decrement
        ++i;//i=i+1 pre increment
        --i;//i=i-1 pre decrement 
        System.out.println(i++);
        System.out.println("value of i is " + i);
        System.out.println(++i);
        System.out.println("value of i is " + i); */
        System.out.println(~i); // 10 = 01010 = 10101 = -11
        boolean t = false;
        System.out.println(!t);
        System.out.println(i+j);
        System.out.println(i-j);
        System.out.println(i*j);
        System.out.println(i/j); //quotient
        System.out.println(i%j); //remainder

        //value<<times = value * 2^times
        System.out.println(10<<3); //10*2^3 = 10*8 = 80

        //value>>times = value / 2^times
        System.out.println(10>>3); //10/ 2^3= 10/8 = 1

     //   bitwise AND(&) and OR(|)
        System.out.println(i>j & i<j); //i=10 j=5  true&false=false
        System.out.println(i>j | i<j); //true | false =true

        //Logical AND(&&) and Logical OR(||)

        System.out.println(i>j && i++<j);
        System.out.println(i);  //i=10 j=5  true&false=false
        System.out.println(i>j || i<j++);
        System.out.println(j);  //true | false =true

        System.out.println(i&j);
        //10&5 
        //1010
        //0101
        //-----------
        //0000 = 0

        i=10;
        j=5;
        i-=5; //i=i-5
        j+=5; //j=j+5
        System.out.println(i+"   "+j);
        short a=5;
        short b=5;
        b=(short)(a+b);   // In any expression the default return type is Integer int

    



    


        
    }
    
}
