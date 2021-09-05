import javax.management.MBeanInfo;

public class Swaptwonumbers2 {
    public static void main(String[] args) {
        int num1 = 55;
        int num2 = 68;
        int swap;
        
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Numbers after swap : ");

        swap = num1;
        num1 = num2;
        num2 = swap;

        System.out.println("First number: " + num1);
        System.out.print("Second number: " + num2);

    }
    
}
