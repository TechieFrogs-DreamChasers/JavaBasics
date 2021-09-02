import java.util.Scanner;



public class Alpha {
    public static void main(String[] args) {
        Scanner oScanner=new Scanner(System.in);
        System.out.println("enter Value");
        char ch= oScanner.next().charAt(0);
        
        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){

        
        System.out.println("it ia an alphabet");
        }else{
            System.out.println("not an alphabet");
        }
        oScanner.close();
    }
    
}
