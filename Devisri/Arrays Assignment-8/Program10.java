import java.util.Arrays;
import java.util.Scanner;
//Print the smallest element in an array
public class Program10 {
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
        int min=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("The smallest element: "+min);
    }
}
/*
Enter the length:
10
All Elements: [86, 29, 94, 95, 98, 81, 26, 58, 21, 87]
The smallest element: 21
Enter the length:
15
All Elements: [26, 34, 80, 76, 98, 61, 73, 20, 97, 19, 30, 44, 92, 80, 20]
The smallest element: 19
 */



