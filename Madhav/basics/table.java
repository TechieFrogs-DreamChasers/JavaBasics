import java.util.Scanner;
public class table {
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int a,i;
        for(i = 1 ; i <= 10 ; i++)
        {
            a = T*i;
            System.out.println(+T+"* "+i+"="+a);
        }

       
    }
}
