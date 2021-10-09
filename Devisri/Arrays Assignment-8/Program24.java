import java.util.Scanner;

//Determine whether given Matrix is a Sparse matrix
public class Program24 {
    public static void main(String[] args) {
        System.out.println("Enter Size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        int[][] mat = new int[size][size];
        int count_Zero = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Enter an Integer value: ");
                mat[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }
        sc.close();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(mat[i][j] + " ");
                if (mat[i][j] == 0) {
                    count_Zero++;
                }
            }
            System.out.println(" ");
        }

        if (count_Zero > (size * size) / 2) {
            System.out.println("It's a Sparse Matrix");
        } else {
            System.out.println("It's not a Sparse Matrix");
        }
    }
}
/*
Enter Size:
3
Enter an Integer value:
3
Enter an Integer value:
0
Enter an Integer value:
0

Enter an Integer value:
0
Enter an Integer value:
3
Enter an Integer value:
0

Enter an Integer value:
0
Enter an Integer value:
0
Enter an Integer value:
3

3 0 0
0 3 0
0 0 3
It's a Sparse Matrix

Enter Size:
3
Enter an Integer value:
1
Enter an Integer value:
2
Enter an Integer value:
0
Enter an Integer value:
5
Enter an Integer value:
0
Enter an Integer value:
5
Enter an Integer value:
3
Enter an Integer value:
6
Enter an Integer value:
0
1 2 0
5 0 5
3 6 0
It's not a Sparse Matrix
 */
