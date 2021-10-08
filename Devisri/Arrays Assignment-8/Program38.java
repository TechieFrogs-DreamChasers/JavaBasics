//Multiply two matrices by passing a matrix to a method
public class Program38 {
    public static void main(String[] args) {
        int size = 5;
        int[][] numbers = new int[size][size];
        System.out.println("Matrix-1: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                numbers[i][j] = (int) (Math.random() * 100) + 1;
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        int[][] product = multiply(numbers);
        System.out.println("Multiplication Matrix with itself: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] multiply(int[][] matrix) {
        int[][] temp = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                temp[i][j] = 0;
                for (int k = 0; k < matrix.length; k++) {
                    temp[i][j] = temp[i][j] + (matrix[i][j] * matrix[i][j]);
                }
            }
        }
        return temp;
    }
}
/*
Matrix-1:
90 12 51 70 79
26 51 52 81 57
25 45 3 35 45
79 4 10 6 97
18 47 38 75 93
Multiplication Matrix with itself:
40500 720 13005 24500 31205
3380 13005 13520 32805 16245
3125 10125 45 6125 10125
31205 80 500 180 47045
1620 11045 7220 28125 43245
 */
