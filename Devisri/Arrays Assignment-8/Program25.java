import java.util.Arrays;

//Determine Whether two matrices are equal
public class Program25 {
    public static void main(String[] args) {
        int size = 3;
        int[][] mat1 = new int[size][size];
        int[][] mat2 = new int[size][size];
        int[][] mat3;
        int[][] mat4;
        mat1[0] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat1[1] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat1[2] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        System.arraycopy(mat1, 0, mat2, 0, mat1.length);
        System.out.println("Matrix-1: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Matrix-2: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Checking equality using System.arraycopy()");
        System.out.println(mat1 == mat2);//false
        System.out.println(Arrays.deepEquals(mat1, mat2));//true
        System.out.println("Matrix-3: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mat3 = mat1;
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Checking equality by passing as variables");
        System.out.println(mat1 == mat2);//false
        System.out.println(Arrays.deepEquals(mat1, mat2));//true
        mat4 = Arrays.copyOf(mat1, mat1.length);
        System.out.println("Matrix-4: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(mat4[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Checking equality using Arrays.copyOf()");
        System.out.println(mat1 == mat2);//false
        System.out.println(Arrays.deepEquals(mat1, mat2));//true
    }
}
/*
Matrix-1:
17 100 71
40 34 40
19 65 63
Matrix-2:
17 100 71
40 34 40
19 65 63
Checking equality using System.arraycopy()
false
true
Matrix-3:
17 100 71
40 34 40
19 65 63
Checking equality by passing as variables
false
true
Matrix-4:
17 100 71
40 34 40
19 65 63
Checking equality using Arrays.copyOf()
false
true
 */
