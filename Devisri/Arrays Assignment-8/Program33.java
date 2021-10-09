//Multiplication-Jagged arrays
public class Program33 {
    public static void main(String[] args) {
        int[][] mat1 = new int[2][];
        int[][] mat2 = new int[2][];
        int[][] mul = new int[2][2];
        mat1[0] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat1[1] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat2[0] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat2[1] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        System.out.println("Matrix-1: ");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(mat1[i][j] + "  ");
            }
            System.out.println(" ");
        }
        System.out.println("Matrix-2: ");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                System.out.print(mat2[i][j] + "  ");
            }
            System.out.println(" ");
        }
        System.out.println("Multiplication: ");
        for (int i = 0; i < mul.length; i++) {
            for (int j = 0; j < mul[i].length; j++) {
                mul[i][j] = 0;
                for (int k = 0; k < mul[i].length; k++) {
                    mul[i][j] = mul[i][j] + (mat1[i][j] * mat2[i][j]);
                    System.out.print(mul[i][j] + "  ");
                }
                System.out.println(" ");
            }
        }
    }
}
/*
Matrix-1:
93  94  60
37  32
Matrix-2:
69  11
48  27  66
Multiplication:
6417  12834
1034  2068
1776  3552
864  1728
 */
