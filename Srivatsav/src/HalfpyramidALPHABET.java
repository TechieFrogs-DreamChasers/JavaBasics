import java.util.Scanner;

public class HalfpyramidALPHABET {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter first Alphabet:");
        //char last = sc.nextLine();
        //char first = sc.nextLine();
        char start = 'A', end = 'F';

    for (int i = 1; i <= (end - 'A' + 1); ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(start + " ");
      }
      ++start;

      System.out.println();
    }
    }
    
}
