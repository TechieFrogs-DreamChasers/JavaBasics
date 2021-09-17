import java.util.Scanner;

public class palindrom {
    
    
public static void main(String[] args) {
    int r,number, sum=0,temp;
    Scanner oScanner=new Scanner(System.in);
    System.out.println("enter number");

 number=oScanner.nextInt();
temp=number;
    
    while(number>0){
        r=number%10;
        sum=(sum*10)+r;
        number=number/10;
        }
     if(temp==sum){
         System.out.println("palindrom number ");
     }
    else{
        System.out.println("not palindrom");

    }
    oScanner.close();

}
    
}
