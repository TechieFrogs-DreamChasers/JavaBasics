import java.util.Scanner;

public class Sandglass {

    public static void main(String[] args) {
        int i,j,k;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(i=1; i <= n ; i++)
        {
            for(k= 1 ; k <= (i-1) ; k++)
            {
                System.out.print(" ");
            }

            for(j=n ; j > (i-1) ; j--)
            {
                System.out.print("* ");

            }
            System.out.println();
        }
        
        for(i = 1 ; i < n ; i++)
        {
            for(k = 1 ; k <= (n-i) ; k++)
            {
                System.out.print(" ");
            }
            for(j = 1; j <= i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
        
    }
    
}
