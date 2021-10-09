//Find the frequency of Odd and Even Numbers in a Matrix
public class Program28 {
    public static void main(String[] args) {
        int size = 3;
        int[][] mat1 = new int[size][size];
        mat1[0] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat1[1] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat1[2] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (mat1[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("The frequency of Odd Numbers: " + odd);
        System.out.println("The frequency of Even Numbers: " + even);
    }
}
/*
39 97 66
83 47 91
96 11 81
The frequency of Odd Numbers: 7
The frequency of Even Numbers: 2
21 94 85
99 4 85
4 59 42
The frequency of Odd Numbers: 5
The frequency of Even Numbers: 4
68 7 25
24 7 10
84 35 24
The frequency of Odd Numbers: 4
The frequency of Even Numbers: 5
*/
