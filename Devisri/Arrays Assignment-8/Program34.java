import java.util.Arrays;

//Calculate Average using arrays
public class Program34 {
    public static void main(String[] args) {
        double average = 0.0D;
        int sum = 0;
        int size = 10;
        int[] numbers = new int[size];
        int[] ints = new int[size];
        int[] add = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = i + (int) (Math.random() * 100) + 1;
            sum += numbers[i];
            average = (sum / size);
        }
        System.out.println("Array-1: " + Arrays.toString(numbers));
        System.out.println("Average of Array-1: " + average);
        sum = 0;
        average = 0;
        for (int i = 0; i < size; i++) {
            ints[i] = i + (int) (Math.random() * 100) + 1;
            sum += ints[i];
            average = (sum / size);
        }
        System.out.println("Array-2: " + Arrays.toString(ints));
        System.out.println("Average of Array-2: " + average);
        sum = 0;
        average = 0;
        for (int i = 0; i < size; i++) {
            add[i] = numbers[i] + ints[i];
            sum += add[i];
            average = (sum / size);
        }
        System.out.println("Adding Array-1 & Array-2: " + Arrays.toString(add));
        System.out.println("Average of the 2 Arrays: " + average);
    }
}
/*
Array-1: [6, 73, 60, 27, 24, 62, 22, 29, 62, 36]
Average of Array-1: 40.0
Array-2: [5, 98, 9, 53, 30, 39, 24, 101, 66, 63]
Average of Array-2: 48.0
Adding Array-1 & Array-2: [11, 171, 69, 80, 54, 101, 46, 130, 128, 99]
Average of the 2 Arrays: 88.0
 */
