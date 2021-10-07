import java.util.Arrays;
import java.util.Scanner;

//Right rotate the elements of an Array
public class Program13 {
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
        rotateRight(numbers,5);
    }
    static void rotateRight(int[] number,int n){
        int count=(n % number.length);
        for(int i=0;i<count;i++){
            int temp=number[number.length-1];
            for(int j=(number.length-1);j>=1;j--){
                number[j]=number[j-1];
            }
            number[0]=temp;
        }
        System.out.println(Arrays.toString(number));
    }
}
/*
Enter the length:
10
All Elements: [76, 70, 53, 49, 95, 82, 13, 20, 76, 56]
[82, 13, 20, 76, 56, 76, 70, 53, 49, 95]
*/
