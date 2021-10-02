package com.Practice.array;

/*
*Java Array is a container that can hold a fixed number of values of the same type.
* The values can be of the primitive type like int, short, byte, or it can be an object like String, Integer etc.
* Despite the fact that array can hold primitive type and object, array itself is an object in java heap,
even if it is declared to hold primitive type data.
* We need to specify the type of values at the time of declaring the array.
*Array size needs to be provided at the time of initialization.
* Java Arrays is the utility class that provides a lot of useful methods to work with arrays.
*We can access array elements using integer index.
*We can traverse through array elements using java for loop or java forEach loop.
* ArrayIndexOutOfBoundsException exception is raised when we try to access
array element by specifying index value larger than the size of array.
 */
public class ArrayCreation {
    public static void main(String[] args) {
        //Declaration of arrays
        //initialization of arrays
        //declaration+initialization of arrays
        //declaration+passing constants as values
        byte[] bytes;
        short[] shorts;
        int[] ints;
        long[] longs;
        float[] floats;
        char[] chars;
        String[] strings;
        // strings = new String[5];
        //chars = new char[5];
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        //floats = new float[]{};
        floats = new float[5];
        float a = 25.5f;


        longs = new long[]{100l, 200l, 300l, 400l, 500l};

        ints = new int[5];

        bytes = new byte[5];
        //or
        shorts = new short[]{1, 2, 3, 4, 5};

        double[] doubles = {10.5d, 20.5d, 30.5d, 40.5d, 50.5d};
        boolean[] booleans = {true, false, true, false, true};

        String s = "Evan Meg Bob John Tom";
        strings = s.split(" ");

        System.out.println("Strings: " + strings[0] + "  " + strings[1] + "  " + strings[2] + "  " + strings[3] + "  " + strings[4]);

        String str = "Mango";
        chars = str.toCharArray();

        System.out.println("Chars: " + chars[0] + "  " + chars[1] + "  " + chars[2] + "  " + chars[3] + "  " + chars[4]);
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        //System.out.println(floats[0]+"  "+floats[1]+"  "+floats[2]+"  "+floats[3]+"  "+floats[4]);
        //now

        floats[0] = a;
        floats[1] = a;
        floats[2] = a;
        floats[3] = a;
        floats[4] = a;

        System.out.println("Floats: " + floats[0] + "  " + floats[1] + "  " + floats[2] + "  " + floats[3] + "  " + floats[4]);
        System.out.println("Longs: " + longs[0] + "  " + longs[1] + "  " + longs[2] + "  " + longs[3] + "  " + longs[4]);

        ints[0] = 15;
        ints[1] = ints[0] + 5;
        ints[2] = ints[1] + 5;
        ints[3] = ints[2] + 5;
        ints[4] = ints[3] + 5;

        System.out.println("Integers: " + ints[0] + "  " + ints[1] + "  " + ints[2] + "  " + ints[3] + "  " + ints[4]);

        bytes[0] = (byte) ints[4];
        bytes[1] = (byte) ints[3];
        bytes[2] = (byte) ints[2];
        bytes[3] = (byte) ints[1];
        bytes[4] = (byte) ints[0];

        System.out.println("Bytes: " + bytes[0] + "  " + bytes[1] + "  " + bytes[2] + "  " + bytes[3] + "  " + bytes[4]);
        System.out.println("Shorts: " + shorts[0] + "  " + shorts[1] + "  " + shorts[2] + "  " + shorts[3] + "  " + shorts[4]);
        System.out.println("Booleans: " + booleans[0] + "  " + booleans[1] + "  " + booleans[2] + "  " + booleans[3] + "  " + booleans[4]);
        System.out.println("Doubles: " + doubles[0] + "  " + doubles[1] + "  " + doubles[2] + "  " + doubles[3] + "  " + doubles[4]);


    }
}
