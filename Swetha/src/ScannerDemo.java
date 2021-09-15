import java.util.Scanner;
public class ScannerDemo {
public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age:");
        
        int age = sc.nextInt();
       /* do{

            System.out.println("Please enter a positive number:");
            while(!sc.hasNextInt()){
                String input=sc.next();
                System.out.println("\"%s" is not a valid number.Please enter avalid number\n", input );
            }
            number = sc.nextInt();

        }while(number<=0);*/

        System.out.println("Enter your name:");
        //sc.nextLine();
        
         String name = sc.next();//this reads the String value from the end user
         //name.charAt(0);//charAt()belongs to String it doesn't belong to Scanner. 
         //boolean b = sc.nextBoolean();

         System.out.println("Enter your Address:");
        String address = sc.nextLine();
        
        //System.out.println("Age is:"+age);
       // boolean b = sc.nextBoolean();
        
        System.out.println("Name is:" + name +" Age is"+ age + "Address is"+ address+" name is"+name);

        System.out.println(name+" "+sc.delimiter());
        
        sc.close();
    }
    
}
