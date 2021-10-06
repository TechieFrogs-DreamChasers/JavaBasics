import java.util.Arrays;

//To copy all elements of one array into another
public class Program1 {
    public static void main(String[] args) {
        //using System.arraycopy()
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {60, 70, 80, 90, 100};
        for (int i : array1) {
            System.out.println("Before copy, value of element in array1: " + i);
        }
        for (int i : array2) {
            System.out.println("Before copy, value of element in array2: " + i);
        }
        System.arraycopy(array2, 0, array1, 0, array2.length);
        for (int i : array1) {
            System.out.println("After copy, value of element in array1: " + i);
        }
        for (int i : array2) {
            System.out.println("After copy, value of element in array2: " + i);
        }
        System.out.println(array1 == array2);//false
        System.out.println(array1.equals(array2));//false

        //using variable equality

        float[] floats1 = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f};
        float[] floats2 = {2.0f, 4.0f, 6.0f, 8.0f, 10.0f};
        for (float i : floats1) {
            System.out.println("Before copy, value of element in floats1: " + i);
        }
        for (float i : floats2) {
            System.out.println("Before copy, value of element in floats2: " + i);
        }
        floats1 = floats2;
        for (float i : floats1) {
            System.out.println("After copy, value of element in floats1: " + i);
        }
        for (float i : floats2) {
            System.out.println("After copy, value of element in floats2: " + i);
        }
        System.out.println(floats1 == floats2);//true
        System.out.println(floats1.equals(floats2));//true

        //using Arrays.copy

        long[] longs1 = {100l, 150l, 200l, 250l, 300l};
        long[] longs2 = {550l, 500l, 450l, 400l, 350l};
        for (long i : longs1) {
            System.out.println("Before copy, value of element in longs1: " + i);
        }
        for (long i : longs2) {
            System.out.println("Before copy, value of element in longs2: " + i);
        }
        longs2 = Arrays.copyOf(longs1, longs1.length);
        for (long i : longs1) {
            System.out.println("After copy, value of element in longs1: " + i);
        }
        for (long i : longs2) {
            System.out.println("After copy, value of element in longs2: " + i);
        }
        System.out.println(longs1 == longs2);//false
        System.out.println(longs1.equals(longs2));//false
    }
}
/*
Before copy, value of element in array1: 10
Before copy, value of element in array1: 20
Before copy, value of element in array1: 30
Before copy, value of element in array1: 40
Before copy, value of element in array1: 50
Before copy, value of element in array2: 60
Before copy, value of element in array2: 70
Before copy, value of element in array2: 80
Before copy, value of element in array2: 90
Before copy, value of element in array2: 100
After copy, value of element in array1: 60
After copy, value of element in array1: 70
After copy, value of element in array1: 80
After copy, value of element in array1: 90
After copy, value of element in array1: 100
After copy, value of element in array2: 60
After copy, value of element in array2: 70
After copy, value of element in array2: 80
After copy, value of element in array2: 90
After copy, value of element in array2: 100
false
false
Before copy, value of element in floats1: 1.5
Before copy, value of element in floats1: 2.5
Before copy, value of element in floats1: 3.5
Before copy, value of element in floats1: 4.5
Before copy, value of element in floats1: 5.5
Before copy, value of element in floats2: 2.0
Before copy, value of element in floats2: 4.0
Before copy, value of element in floats2: 6.0
Before copy, value of element in floats2: 8.0
Before copy, value of element in floats2: 10.0
After copy, value of element in floats1: 2.0
After copy, value of element in floats1: 4.0
After copy, value of element in floats1: 6.0
After copy, value of element in floats1: 8.0
After copy, value of element in floats1: 10.0
After copy, value of element in floats2: 2.0
After copy, value of element in floats2: 4.0
After copy, value of element in floats2: 6.0
After copy, value of element in floats2: 8.0
After copy, value of element in floats2: 10.0
true
true
Before copy, value of element in longs1: 100
Before copy, value of element in longs1: 150
Before copy, value of element in longs1: 200
Before copy, value of element in longs1: 250
Before copy, value of element in longs1: 300
Before copy, value of element in longs2: 550
Before copy, value of element in longs2: 500
Before copy, value of element in longs2: 450
Before copy, value of element in longs2: 400
Before copy, value of element in longs2: 350
After copy, value of element in longs1: 100
After copy, value of element in longs1: 150
After copy, value of element in longs1: 200
After copy, value of element in longs1: 250
After copy, value of element in longs1: 300
After copy, value of element in longs2: 100
After copy, value of element in longs2: 150
After copy, value of element in longs2: 200
After copy, value of element in longs2: 250
After copy, value of element in longs2: 300
false
false
*/