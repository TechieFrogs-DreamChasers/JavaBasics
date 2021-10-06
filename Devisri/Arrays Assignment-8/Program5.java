//Print elements of an array
public class Program5 {
    public static void main(String[] args) {
        String s = "Evan is the brother of Bob.";
        String[] strings = s.split(" ");
        s = s.replace(" ", "");
        char[] chars = s.toCharArray();
        byte[] bytes = s.getBytes();

        int[] ints = new int[10];
        long[] longs = new long[10];
        boolean[] booleans = new boolean[]{true, false, false, false, true};

        float[][] floats = new float[5][5];

        floats[0] = new float[]{1.5f, 2.5f, 3.5f, 4.5f, 5.5f};
        floats[1] = new float[]{1.4f, 2.4f, 3.4f, 4.4f, 5.4f};
        floats[2] = new float[]{1.3f, 2.3f, 3.3f, 4.3f, 5.3f};
        floats[3] = new float[]{1.2f, 2.2f, 3.2f, 4.2f, 5.2f};
        floats[4] = new float[]{1.1f, 2.1f, 3.1f, 4.1f, 5.1f};

        double[][] doubles = {
                {10.1, 10.2, 10.3, 10.4, 10.5},
                {15.1, 15.2, 15.3, 15.4, 15.5},
                {20.1, 20.2, 20.3, 20.4, 20.5},
                {25.1, 25.2, 25.3, 25.4, 25.5},
                {30.1, 30.2, 30.3, 30.4, 30.5}};

        for (char c : chars) {
            System.out.println("Character at this index: " + c);
        }
        System.out.println(" ");
        for (byte b : bytes) {
            System.out.println("Byte at this index: " + b);
        }
        System.out.println(" ");
        for (String s1 : strings) {
            System.out.println("String at this index: " + s1);
        }
        System.out.println(" ");
        for (int i : ints) {
            i = (int) (Math.random() * 100) + 1;
            System.out.println("Integer at this index: " + i);
        }
        System.out.println(" ");
        for (int l = 0; l < longs.length; l++) {
            longs[l] = (long) (l + (Math.random() * 100 + 1));
            System.out.println("Long at this index: " + longs[l]);
        }
        System.out.println(" ");
        for (boolean b : booleans) {
            System.out.println("Boolean at this index: " + b);
        }
        System.out.println(" ");
        for (float[] aFloat : floats) {
            for (float v : aFloat) {
                System.out.print(v + "  ");
            }
            System.out.println("  ");
        }
        System.out.println(" ");
        for (double[] d : doubles) {
            for (double v : d) {
                System.out.print(v + "  ");
            }
            System.out.println("  ");
        }
    }
}
/*
Character at this index: E
Character at this index: v
Character at this index: a
Character at this index: n
Character at this index: i
Character at this index: s
Character at this index: t
Character at this index: h
Character at this index: e
Character at this index: b
Character at this index: r
Character at this index: o
Character at this index: t
Character at this index: h
Character at this index: e
Character at this index: r
Character at this index: o
Character at this index: f
Character at this index: B
Character at this index: o
Character at this index: b
Character at this index: .

Byte at this index: 69
Byte at this index: 118
Byte at this index: 97
Byte at this index: 110
Byte at this index: 105
Byte at this index: 115
Byte at this index: 116
Byte at this index: 104
Byte at this index: 101
Byte at this index: 98
Byte at this index: 114
Byte at this index: 111
Byte at this index: 116
Byte at this index: 104
Byte at this index: 101
Byte at this index: 114
Byte at this index: 111
Byte at this index: 102
Byte at this index: 66
Byte at this index: 111
Byte at this index: 98
Byte at this index: 46

String at this index: Evan
String at this index: is
String at this index: the
String at this index: brother
String at this index: of
String at this index: Bob.

Integer at this index: 9
Integer at this index: 60
Integer at this index: 34
Integer at this index: 69
Integer at this index: 18
Integer at this index: 87
Integer at this index: 18
Integer at this index: 89
Integer at this index: 59
Integer at this index: 77

Long at this index: 20
Long at this index: 53
Long at this index: 58
Long at this index: 89
Long at this index: 23
Long at this index: 73
Long at this index: 49
Long at this index: 74
Long at this index: 15
Long at this index: 84

Boolean at this index: true
Boolean at this index: false
Boolean at this index: false
Boolean at this index: false
Boolean at this index: true

1.5  2.5  3.5  4.5  5.5
1.4  2.4  3.4  4.4  5.4
1.3  2.3  3.3  4.3  5.3
1.2  2.2  3.2  4.2  5.2
1.1  2.1  3.1  4.1  5.1

10.1  10.2  10.3  10.4  10.5
15.1  15.2  15.3  15.4  15.5
20.1  20.2  20.3  20.4  20.5
25.1  25.2  25.3  25.4  25.5
30.1  30.2  30.3  30.4  30.5
 */
