import java.util.Scanner;

//Determine whether given Matrix is an Identity matrix
public class Program23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of matrix: ");
        int size = sc.nextInt();
        sc.nextLine();
        sc.close();
        int[][] matrix = checkIdentity(size);
        System.out.println("Identity Matrix: ");
        for (int[] ints : matrix) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
    }

    public static int[][] checkIdentity(int size) {
        int[][] temp = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                temp[i][j] = (i == j) ? 1 : 0;
            }
        }
        return temp;
    }
}
/*
Enter size of matrix:
5
Identity Matrix:
1 0 0 0 0
0 1 0 0 0
0 0 1 0 0
0 0 0 1 0
0 0 0 0 1
 */
