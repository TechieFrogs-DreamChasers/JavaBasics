import java.util.Scanner;
public class Sixth {


    public static void main(String[] args) {
        int i, j, k;
            Scanner num = new Scanner(System.in);
            System.out.println("Enter the number i");
            i = num.nextInt();
            System.out.println("Enter the number j");
            j = num.nextInt();
            System.out.println("Enter the number k");
            k = num.nextInt();

            if(i>j && i>k){
                System.out.println("Greater num is i" +i);
            }else if(j>k){
                System.out.println("Greater num is j" +j);
            }else{
                System.out.println("Greater num is k" +k);
            }



    }
    
}
