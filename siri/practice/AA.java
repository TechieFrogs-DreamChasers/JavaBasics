import java.util.Scanner;

public class AA {
    int x;
    int y;
    int sum;
    public static void main(String[] args) {
       
        Scanner oScanner=new Scanner(System.in);
        AA oadd=new AA();
        
        System.out.println("enter number");
        oadd.x=oScanner.nextInt();
        System.out.println("enter number");
        oadd.y=oScanner.nextInt();
        oadd.sum=oadd.x+oadd.y;
        System.out.println("sum is :"+oadd. sum);
        
        oScanner.close();
    }
    
}
