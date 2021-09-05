import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner oScanner=new Scanner(System.in);
        System.out.println("Enter number");
        int num=oScanner.nextInt();
       if (num%2==0){
           System.out.println("given num is even");

       }else{
       System.out.println("given num is odd");
       

       }
            oScanner.close();
        }
    }
    

