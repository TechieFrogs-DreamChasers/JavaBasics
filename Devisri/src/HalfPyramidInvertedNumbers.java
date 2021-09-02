import java.util.Scanner;

public class HalfPyramidInvertedNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int number=scanner.nextInt();
        scanner.close();
        loop1: for(int i=number;i>=1;i--){
            loop2: for (int j=i;j>=i;j--){
                loop3:for (int k=1;k<=j;k++){
                    System.out.print(k+" ");
                }
                System.out.println();
            }
        }
    }
}
