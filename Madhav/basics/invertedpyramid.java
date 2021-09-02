import java.util.Scanner;
public class invertedpyramid {

    public static void main(String args[])
    {
        int i,j,k,l;
        Scanner Scan = new Scanner(System.in);
        int n = Scan.nextInt();
        for(i = 1 ; i <=n ; i++)
        {
            if(i > 1)
            {
                for(j = 1 ; j <= (i-1) ; j++)
                {
                    System.out.print(" ");
                }
            }
            for( k =(n - i)+1 ; k > 0 ; k--)
            {
                System.out.print("*");
            }
            for(l = i ; l <= (n-1) ; l++)
            {
                System.out.print("*");
            }
            System.out.println();
    
}
    }
}
