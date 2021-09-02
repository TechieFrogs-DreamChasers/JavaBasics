import java.util.Scanner;

public class HalfPyramidNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int number=scanner.nextInt();
        scanner.close();
       loop1: for(int i=1;i<=number;i++){
            loop2: for (int j=1;j<=i;j++){
                loop3:for (int k=j;k>=j;k--){
                     System.out.print(k+" ");
            }
                System.out.print("");
           }
           System.out.println();
        }
    }
}
