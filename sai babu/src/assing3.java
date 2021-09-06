import java.util.Scanner;

public class assing3 {
    public static void main(String args[]){
        Scanner scannerObj = new Scanner(System.in);
        int a,b,temp;
        System.out.println("enter the value of a");
        
        
        a=scannerObj.nextInt();
        System.out.println("enter the value of b");
        b=scannerObj.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("the values of a and b after swapping is "+a+" and "+b);
        scannerObj.close();
        


    }
    
}
