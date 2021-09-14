import java.util.Scanner;
public class ScannerDemo {
public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age:");
        
        int age = sc.nextInt();

        System.out.println("Enter your name:");
        //sc.nextLine();
        
         String name = sc.next();//this reads the String value from the end user
         //name.charAt(0);//charAt()belongs to String it doesn't belong to Scanner. 

         //System.out.println("Enter your Address:");
       // String address = sc.nextLine();
        
        //System.out.println("Age is:"+age);
        boolean b = sc.nextBoolean();
        
        System.out.println("Name is:" + name +" "+"Age is"+ age +" "+/*"Address is"+ address + */"char is"+"  "+name.charAt(3));

        System.out.println(name+" "+sc.delimiter());
        
        sc.close();
    }
    
}
