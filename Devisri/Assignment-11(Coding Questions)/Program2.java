import java.util.Arrays;

//Separate zeroes from Non-zeroes in an Array
public class Program2 {
    public static void main(String[] args) {
        //Array of integers of size 10
        int[] integers = {14, 0, 5, 0, 9, 0, 12, 15, 0, 19};
        //Method call
        moveZeroes(integers);
    }

    static void moveZeroes(int[] array) {
        //putting length of the array into another variable
        int length = array.length;
        //count value for further iterations
        int count = 0;
        //Traversing through parameter array
        for (int i = 0; i < array.length; i++) {
            //checking whether index of i is zero or not
            if (array[i] != 0) {
                //If not placing that element in ith place and incrementing
                array[count++] = array[i];
            }
        }
        //we now have another value for count so checking count less than length
        while (count < length) {
            //length here is 10 and remaining count values of indexes in array are set to 0
            array[count++] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}
