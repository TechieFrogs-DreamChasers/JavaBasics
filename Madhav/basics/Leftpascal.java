import java.util.Scanner;

public class Leftpascal {

    public static void main(String[] args) {
        int i,j,k;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(i=1; i <= n ; i++)
        {
            for(k= (n-i) ; k > 0 ; k--)
            {
                System.out.print(" ");
            }

            for(j=1 ; j <=i ; j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
        
        for(i = 1 ; i < n ; i++)
        {
            for(k = 1 ; k <= i ; k++)
            {
                System.out.print(" ");
            }
            for(j = 1; j <= (n-i) ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
        
    }
    
}
