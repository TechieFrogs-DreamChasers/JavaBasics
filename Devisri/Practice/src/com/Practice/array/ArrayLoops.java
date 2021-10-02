package com.Practice.array;

public class ArrayLoops {
    public static void main(String[] args) {
        String s1 = "Funny";
        char[] chars = s1.toCharArray();
        byte[] bytes = s1.getBytes();
        String[] strings = {"Apple", "Banana", "Cherry", "Dates", "ElderBerry"};
        int[] ints = new int[5];
        double[] doubles = new double[]{100.1d, 200.2d, 300.3d, 400.4d, 500.5d};

        for (char c : chars) {
            System.out.println("The Character at this index: " + c);
        }

        for (byte b : bytes) {
            System.out.println("The Byte value at this index: " + b);
        }

        for (String s : strings) {
            System.out.println("The String value at this index: " + s);
        }

        for (int i : ints) {
            i = (int)(Math.random() * 100) + 1;
            System.out.println("The Integer value at this index: " + i);
        }

        for (double d : doubles) {
            System.out.println("The Double value at this index: " + d);
        }
    }
}
