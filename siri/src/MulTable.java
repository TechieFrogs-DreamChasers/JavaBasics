import java.util.Scanner;

public class MulTable {
    public static void main(String[] args) {
        int i=1;
    
        Scanner oScanner=new Scanner(System.in);
        System.out.println("enter number");
        int num = oScanner.nextInt();
        while(i<=10){
        System.out.println(num +"*"+i+"="+num*i);
        i++;
        }
        oScanner.close();
    }

    
}
