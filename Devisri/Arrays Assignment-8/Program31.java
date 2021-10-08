//Find the transpose of given matrix
public class Program31 {
    public static void main(String[] args) {
        int[][] mat1 = new int[3][3];
        mat1[0] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat1[1] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat1[2] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        System.out.println("Original Matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat1[i][j] + " | ");
            }
            System.out.println(" ");
        }
        System.out.println("Transpose Matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat1[j][i] + " | ");
            }
            System.out.println(" ");
        }

    }
}
/*
Original Matrix:
84 | 53 | 14 |
56 | 35 | 95 |
24 | 59 | 21 |
Transpose Matrix:
84 | 56 | 24 |
53 | 35 | 59 |
14 | 95 | 21 |

*/
