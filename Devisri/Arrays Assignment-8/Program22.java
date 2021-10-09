//Subtract two matrices
public class Program22 {
    public static void main(String[] args) {
        int[][] mat1 = new int[3][3];
        int[][] mat2 = new int[3][3];
        int[][] result = new int[3][3];
        mat1[0] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat1[1] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat1[2] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat2[0] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat2[1] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat2[2] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        System.out.println("Matrix-1:");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(mat1[i][j] + "  ");
            }
            System.out.println(" ");
        }
        System.out.println("Matrix-2:");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                System.out.print(mat2[i][j] + "  ");
            }
            System.out.println(" ");
        }
        System.out.println("(Matrix-1) - (Matrix-2):");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                result[i][j] = mat1[i][j] - mat2[i][j];
                System.out.print(result[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
}
/*
Matrix-1:
83  55  65
55  41  20
55  25  27
Matrix-2:
70  62  81
34  19  69
64  19  68
(Matrix-1) - (Matrix-2):
13  -7  -16
21  22  -49
-9  6  -41
 */
