import java.util.Arrays;
import java.util.Scanner;

//Print the largest element in an array
public class Program9 {
    public static void main(String[] args) {
        System.out.println("Enter the length: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();
        sc.close();
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("All Elements: " + Arrays.toString(numbers));
        int max=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("The largest element: "+max);

    }
}
/*
Enter the length:
10
All Elements: [54, 84, 73, 68, 56, 65, 63, 91, 100, 64]
The largest element: 100

 */
