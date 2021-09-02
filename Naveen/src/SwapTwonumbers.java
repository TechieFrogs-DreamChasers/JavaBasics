public class SwapTwonumbers {
    public static void main(String[] args) {

        int n1 = 10, n2 = 20;

        System.out.println("--Before swap--");
        System.out.println("First number = " + n1);
        System.out.println("Second number = " + n2);

        n1 = n1-n2;
        n2 = n1+ n2;
        n1 = n2-n1;

        System.out.println("--After swap--");
        System.out.println("First number = " + n1);
        System.out.println("Second number = " + n2);
    }
}