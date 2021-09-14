

public class DataTypes {

    int i = 10;
    boolean b = true;
    double d = 4.5;
    float f = 3.5f;
    char a = 'A';

    public static void main(String[] args) {
      

        int i = 20;
        int j = 30;
        System.out.println(i++ + i+j);//20 21+30 = 20+51= 71
        System.out.println(--j);//29
        System.out.println(i++);//21
        System.out.println(i+j);//22+29 = 51

        System.out.println(i<<2);//22*4 = 88
        System.out.println(j>>3);//29/8 = 3
        System.out.println(++i - ++j);//23-30 = -7

        i= i+1;
        System.out.println(i);
//Ternary Operator
        int a=5;
        int b=10;

        int ing = (a<b)? a:b;

        System.out.println((a>b)?a:b);
       System.out.println(ing);
//Assignment Operator

       int c=2;//Suppose if you give short c = 2 (then you have to give a = short(a+b))
       int d=4;

       c+=3;//c= c+3 = 5
       d-=1;// d = d-1 = 3

       System.out.println(c);
       System.out.println(d);
       


    }

}
