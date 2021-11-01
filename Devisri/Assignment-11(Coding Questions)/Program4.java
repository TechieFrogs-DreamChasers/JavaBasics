import java.util.Arrays;

//Find all the Leaders in an Integer Array
public class Program4 {
    public static void main(String[] args) {
        //reading an integer array of length 10
        int[] ints = new int[10];
        //Generating values using Math.random
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) ((Math.random() * 100) + 1);
        }
        leaders(ints);
    }

    static void leaders(int[] numbers) {
        int len = numbers.length;
        //Putting max as last element in array
        int max = numbers[len - 1];
        System.out.println("Array elements are: " + Arrays.toString(numbers));
        System.out.println(max);
        //With max in hand, traversing backwards in array
        for (int i = len - 2; i >= 0; i--) {
            //if array of ith element is greater than max
            if (numbers[i] > max) {
                //printing that value
                System.out.println(numbers[i]);
                //changing max to new greater value
                max = numbers[i];
            }
        }
    }
}
/*
Array elements are: [69, 25, 55, 96, 7, 3, 4, 82, 74, 30]
30
74
82
96
 */