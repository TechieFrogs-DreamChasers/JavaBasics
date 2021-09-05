import java.util.Scanner;

public class Naturalnumber {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("enter the n value:");
        int num=0;
       // int i;
        int n=scannerObj.nextInt();
        /*for(i=1;i<=n;i++)
        {
            num=num+i;

        }*/

        //while loop
        int i=1;
        while (i<=n) {
            num=num+i;
            i++;
            
        }
        System.out.println("sum of natural number is:" +" "+ num);




        scannerObj.close();
    }
    
}
