//Display Upper Triangular Matrix
public class Program27 {
    public static void main(String[] args) {
        int size = 5;
        int[][] matrix = new int[size][size];
        int value = (int) ((Math.random() * 100) + 1);
        matrix[0] = new int[]{value, value, value, value, value};
        matrix[1] = new int[]{value, value, value, value, value};
        matrix[2] = new int[]{value, value, value, value, value};
        matrix[3] = new int[]{value, value, value, value, value};
        matrix[4] = new int[]{value, value, value, value, value};
        System.out.println("Original Matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        int[][] utMat = displayUTMatrix(matrix);
        System.out.println("Upper Triangular Matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(utMat[i][j] + "   ");
            }
            System.out.println(" ");
        }
    }

    static int[][] displayUTMatrix(int[][] matrix) {
        int[][] temp = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                temp[i][j] = (i > j) ? 0 : matrix[i][j];
            }
        }
        return temp;
    }
}
/*
Original Matrix:
71 71 71 71 71
71 71 71 71 71
71 71 71 71 71
71 71 71 71 71
71 71 71 71 71
Upper Triangular Matrix:
71  71   71   71   71
0   71   71   71   71
0   0    71   71   71
0   0     0   71   71
0   0     0   0    71
 */
