import java.util.Scanner;

public class assign6 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner ScannerObj=new Scanner(System.in);
        System.out.println("enter a value");
        a=ScannerObj.nextInt();
        System.out.println("enter b value");
        b=ScannerObj.nextInt();
        System.out.println("enter c value");
        c=ScannerObj.nextInt();
        if(a>b && a>c)
            System.out.println(a+"is larger");
        else if(b>a && b>c)
            System.out.println(b+" is lartger");
        else
            System.out.println(c+" is larger");
        ScannerObj.close();
    }

}
