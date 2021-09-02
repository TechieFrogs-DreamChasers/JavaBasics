import java.util.Scanner;

public class pascal {

    public static void main(String args[])
    {
        int i,j,k,l,x;
        Scanner Scan = new Scanner(System.in);
        int n = Scan.nextInt();
        for(i=0 ; i < n ; i++)
        {
            for(j = 0 ; j < (n-i) ; j++)
            {
                System.out.print(" ");

            }
            System.out.print("1");
            if(i >= 2)
            {
                for(k = i ; k <= i ; k++)
                {
                    for(l = 1 ; l < i ; l++)
                    {

                        int c = (int)(factorial(k) / (factorial(k - l) * factorial(l)));

                        System.out.print(" "+c+" ");
                    }
                }
            }
            if(i>0)
            {
                System.out.print(" 1");
            }
            System.out.println();
        }
    }

    
    

    static long factorial(int num) {
        int f = 1;
        for (int h = 1; h <= num; h++) {
            f = f * h;
        }
        return f;
    }
}


    
