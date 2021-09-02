import java.util.Scanner;

public class LeftPascalTriangle {
    public static void main(String[] args) {
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int number=scanner.nextInt();
        scanner.close();*/
        for(int i=1;i<5;i++){
            for (int j=i;j<=5;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--){
            for (int j=i;j<=5;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
