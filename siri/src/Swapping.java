import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner oScanner=new Scanner(System.in);
        System.out.println("Enter number");
        int i=oScanner.nextInt();
        System.out.println("Enter number");
        int j=oScanner.nextInt();
        System.out.println("before swapping:"+i +"   " + j);
        int t=i;
        i=j;
        j=t;
        System.out.println("after swapping"+ i);
        System.out.println("aftern swapping" +j);
        oScanner.close();

    }
    
}
