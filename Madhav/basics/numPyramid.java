import java.util.Scanner;
public class numPyramid {
    public static void main(String args[])
    {
        int i,j,k,l;
        Scanner Scan = new Scanner(System.in);
        int n = Scan.nextInt();
        for(i = 1 ; i <= n ; i++)
        {
            for(j = (n-i) ; j > 0 ; j--)
            {
                System.out.print(" ");
            }
            for(k = i ; k <= ((2 * i) - 1) ; k++)
            {
                System.out.print(k);
                
            }
            
            if(i > 1)
               {
                   for(l = ((2*i)-2) ; l >= i ; l--)
                         {
                           System.out.print(l);
                         }
                 }
                 System.out.println();
            
        }
        
    }
    
    
}
