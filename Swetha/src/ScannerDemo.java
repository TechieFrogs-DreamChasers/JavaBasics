import java.util.Scanner;
public class ScannerDemo {
public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your name:");
        
        String name = sc.next();//this reads the String value from the end user
        System.out.println("Enter your age:");
        
        int age = sc.nextInt();
        System.out.println("Age is:"+age);
        boolean b = sc.nextBoolean();
        
        System.out.println("Name is:" + name +" "+"Age is"+ age);

        //System.out.println(name+" "+sc.delimiter());
        
        sc.close();
    }
    
}
