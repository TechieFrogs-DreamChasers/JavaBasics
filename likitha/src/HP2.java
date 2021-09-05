import java.util.Scanner;


public class HP2 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        char last='I', alphabet='A';
        for(int i=1;i<=(last-alphabet+1);++i)
        {
            for(int j=1;j<=i;++j)
            {
                System.out.print(alphabet+" ");
            }
            ++alphabet;
            System.out.println();
        }
        scannerObj.close();
    }
    
}