//Display Lower Triangular Matrix
public class Program26 {
    public static void main(String[] args) {
        int size = 3;
        int[][] mat1 = new int[size][size];
        int value = (int) ((Math.random() * 100) + 1);
        mat1[0] = new int[]{value, value, value, value, value};
        mat1[1] = new int[]{value, value, value, value, value};
        mat1[2] = new int[]{value, value, value, value, value};
        System.out.println("Original Matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println(" ");
        }
        int[][] ltMat = displayLTMatrix(mat1);
        System.out.println("Lower Triangular Matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(ltMat[i][j] + "   ");
            }
            System.out.println(" ");
        }

    }

    static int[][] displayLTMatrix(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result[i][j] = (i < j) ? 0 : matrix[i][j];
            }
        }
        return result;
    }
}
/*
Original Matrix:
68 68 68
68 68 68
68 68 68
Lower Triangular Matrix:
68   0   0
68   68   0
68   68   68
 */
