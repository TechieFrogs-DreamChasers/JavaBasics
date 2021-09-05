import java.util.Scanner;


public class IHP1 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        int row=5;
        for(int i=row;i>=1;--i)
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
