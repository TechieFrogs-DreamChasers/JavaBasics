import java.util.Scanner;

public class Pascaltriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        int coef = 5;

        for(int i = 0; i < rows; i++) {
            for(int space = 1; space < rows - i; ++space) {
              System.out.print("  ");
            }
      
            for(int j = 0; j <= i; j++) {
              if (j == 0 || i == 0)
                coef = 1;
              else
                coef = coef * (i - j + 1) / j;
      
              System.out.printf("%4d", coef);
            }
      
            System.out.println();
          }
    }
    
    
}
