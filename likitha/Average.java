import java.util.Scanner;

public class Average {
    public static int Average1(int a, int b, int c,int n)
    {
        int avg=(a+b+c)/n;
        System.out.println(avg);
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //  Average A=new Average();
System.out.println("enter sides");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("enter n value");
        int n=sc.nextInt();
        Average1(a,b,c,n);
       



        sc.close();
    }
}
