public class ForEven {
  public static void main(String[] args) {
    for (int x = 2; x <= 20; x += 2)
      System.out.println(x + " is even");
    System.out.println("*******************");
    for (int y = 2; y <= 10; y += 2) {
      int i = y * y;
      System.out.println(i + " is square of " + y);
    }
    System.out.println("*******************");
    for (int z = 2; z <= 10; z += 2) {
      int i = z * z * z;
      System.out.println(i + " is cube of " + z);
    }
  }
}
