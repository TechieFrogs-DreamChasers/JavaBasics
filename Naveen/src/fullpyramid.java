public class fullpyramid {
public static void main(String[] args) {
    int a = 5, b = 0;

    for (int i = 1; i <= a; ++i, b = 0) {
      for (int n = 1; n <= a - i; ++n) {
        System.out.print("  ");
      }

      while (b != 2 * i - 1) {
        System.out.print("* ");
        ++b;
      }

      System.out.println();
    }

    
}
    
}
