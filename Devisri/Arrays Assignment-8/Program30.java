//Find the sum of each row and column
public class Program30 {
    public static void main(String[] args) {
        int[][] mat1 = new int[3][3];
        mat1[0] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat1[1] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat1[2] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        rowSum(mat1);
        System.out.println(" ");
        colSum(mat1);
    }

    static void rowSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            System.out.println("The sum of " + i + " row: " + sum);
        }

    }

    static void colSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[j][i];
            }
            System.out.println("The sum of " + i + " column: " + sum);
        }

    }
}
/*
48 64 38
83 28 33
83 14 37

The sum of 0 row: 150
The sum of 1 row: 294
The sum of 2 row: 428

The sum of 0 column: 214
The sum of 1 column: 320
The sum of 2 column: 428
 */
