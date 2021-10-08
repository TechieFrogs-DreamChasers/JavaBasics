//Multiplication Of Multi-Dimensional Matrices
public class Program37 {
    public static void main(String[] args) {
        int size = 3;
        int value = (int) (Math.random() * 100) + 1;
        int[][][] mat1 = {
                {{value, value, value}, {value, value, value}, {value, value, value}},
                {{value, value, value}, {value, value, value}, {value, value, value}},
                {{value, value, value}, {value, value, value}, {value, value, value}}};
        int[][][] mat2 = {
                {{2, 2, 2}, {4, 4, 4}, {6, 6, 6}},
                {{2, 2, 2}, {4, 4, 4}, {6, 6, 6}},
                {{2, 2, 2}, {4, 4, 4}, {6, 6, 6}}};
        int[][][] product = new int[3][3][3];
        System.out.println("Matrix-1: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    System.out.print(mat1[i][j][k] + " ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("Matrix-2: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    System.out.print(mat2[i][j][k] + " ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("Multiplication: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    product[i][j][k] = 0;
                    for (int q = 0; q < size; q++) {
                        product[i][j][k] = product[i][j][k] + (mat1[i][j][k] * mat2[i][j][k]);
                    }
                    System.out.print(product[i][j][k] + " ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
/*
Matrix-1:
24 24 24  24 24 24  24 24 24
24 24 24  24 24 24  24 24 24
24 24 24  24 24 24  24 24 24
Matrix-2:
2 2 2  4 4 4  6 6 6
2 2 2  4 4 4  6 6 6
2 2 2  4 4 4  6 6 6
Multiplication:
144 144 144  288 288 288  432 432 432
144 144 144  288 288 288  432 432 432
144 144 144  288 288 288  432 432 432
 */
