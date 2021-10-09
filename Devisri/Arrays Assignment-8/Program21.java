import java.util.Arrays;
import java.util.Scanner;

//Sort an array
public class Program21 {
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
        int[] sortedNumbers = ascSortOrder(numbers);
        System.out.println("Sorted Ascending Order: " + Arrays.toString(sortedNumbers));
        int[] sortedDescNumbers = new int[numbers.length];
        for (int i = 0; i < sortedNumbers.length; i++) {
            sortedDescNumbers[sortedNumbers.length - i - 1] = sortedNumbers[i];
        }
        System.out.println("Sorted Descending Order: " + Arrays.toString(sortedDescNumbers));
    }

    static int[] ascSortOrder(int[] ints) {
        //To loop the while and for until the condition checks
        boolean flag = true;
        int temp = 0;
        //Another way to copy an array
        int result[] = Arrays.copyOf(ints, ints.length);
        while (flag) {
            //setting flag to false
            flag = false;
            //now we enter for loop
            for (int i = 0; i < ints.length - 1; i++) {
                //check if result[0...]>result[1...] if true swap happens till loop breaks
                if (result[i] > result[i + 1]) {
                    temp = result[i];
                    result[i] = result[i + 1];
                    result[i + 1] = temp;
                    //flag is true it breaks the loop
                    flag = true;
                }
            }
        }
        return result;
    }
}
/*
Enter the length:
10
All Elements: [93, 32, 15, 68, 7, 36, 77, 13, 86, 79]
Sorted Ascending Order: [7, 13, 15, 32, 36, 68, 77, 79, 86, 93]
Sorted Descending Order: [93, 86, 79, 77, 68, 36, 32, 15, 13, 7]
 */