import java.util.Scanner;


public class HP1 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        int row=5;
        for(int i=1;i<=row;++i)
        {
            for(int j=1;j<=i;++j)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        scannerObj.close();
    }
    
}