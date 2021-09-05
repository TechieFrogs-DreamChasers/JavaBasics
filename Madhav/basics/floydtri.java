import java.util.Scanner;
public class floydtri 
{
    public static void main(String args[])
    {
        int i,j,temp=0;
        Scanner Scan = new Scanner(System.in);
        int n = Scan.nextInt();
        for(i = 1 ; i <= n ; i++)
        {
            for(j = 1 ; j <= i ; j++)
            {
                temp = temp + 1 ;
                System.out.print(temp);
            }
            System.out.println();
        }
    }
    

}
