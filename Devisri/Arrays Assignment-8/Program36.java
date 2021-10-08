//Add two Matrices using Multi-Dimensional Array
public class Program36 {
    public static void main(String[] args) {
        int size = 5;
        int val = (int) (Math.random() * 100) + 1;
        int[][][] mat1 =
                {
                        {
                                {val, val, val, val, val},
                                {val, val, val, val, val},
                                {val, val, val, val, val},
                                {val, val, val, val, val},
                                {val, val, val, val, val}},
                        {
                                {val, val, val, val, val},
                                {val, val, val, val, val},
                                {val, val, val, val, val},
                                {val, val, val, val, val},
                                {val, val, val, val, val}},
                        {
                                {val, val, val, val, val},
                                {val, val, val, val, val},
                                {val, val, val, val, val},
                                {val, val, val, val, val},
                                {val, val, val, val, val}},
                        {
                                {val, val, val, val, val},
                                {val, val, val, val, val},
                                {val, val, val, val, val},
                                {val, val, val, val, val},
                                {val, val, val, val, val}},
                        {
                                {val, val, val, val, val},
                                {val, val, val, val, val},
                                {val, val, val, val, val},
                                {val, val, val, val, val},
                                {val, val, val, val, val}}
                };
        int[][][] mat2 =
                {
                        {{1, 2, 3, 4, 5}, {5, 6, 7, 8, 9}, {1, 2, 3, 4, 5}, {5, 6, 7, 8, 9}, {1, 2, 3, 4, 5}},
                        {{1, 2, 3, 4, 5}, {5, 6, 7, 8, 9}, {1, 2, 3, 4, 5}, {5, 6, 7, 8, 9}, {1, 2, 3, 4, 5}},
                        {{1, 2, 3, 4, 5}, {5, 6, 7, 8, 9}, {1, 2, 3, 4, 5}, {5, 6, 7, 8, 9}, {1, 2, 3, 4, 5}},
                        {{1, 2, 3, 4, 5}, {5, 6, 7, 8, 9}, {1, 2, 3, 4, 5}, {5, 6, 7, 8, 9}, {1, 2, 3, 4, 5}},
                        {{1, 2, 3, 4, 5}, {5, 6, 7, 8, 9}, {1, 2, 3, 4, 5}, {5, 6, 7, 8, 9}, {1, 2, 3, 4, 5}}
                };

        int[][][] sum = new int[size][size][size];
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
        System.out.println("Addition: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    sum[i][j][k] = mat1[i][j][k] + mat2[i][j][k];
                    System.out.print(sum[i][j][k] + " ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
/*
Matrix-1:
67 67 67 67 67  67 67 67 67 67  67 67 67 67 67  67 67 67 67 67  67 67 67 67 67
67 67 67 67 67  67 67 67 67 67  67 67 67 67 67  67 67 67 67 67  67 67 67 67 67
67 67 67 67 67  67 67 67 67 67  67 67 67 67 67  67 67 67 67 67  67 67 67 67 67
67 67 67 67 67  67 67 67 67 67  67 67 67 67 67  67 67 67 67 67  67 67 67 67 67
67 67 67 67 67  67 67 67 67 67  67 67 67 67 67  67 67 67 67 67  67 67 67 67 67
Matrix-2:
1 2 3 4 5  5 6 7 8 9  1 2 3 4 5  5 6 7 8 9  1 2 3 4 5
1 2 3 4 5  5 6 7 8 9  1 2 3 4 5  5 6 7 8 9  1 2 3 4 5
1 2 3 4 5  5 6 7 8 9  1 2 3 4 5  5 6 7 8 9  1 2 3 4 5
1 2 3 4 5  5 6 7 8 9  1 2 3 4 5  5 6 7 8 9  1 2 3 4 5
1 2 3 4 5  5 6 7 8 9  1 2 3 4 5  5 6 7 8 9  1 2 3 4 5
Addition:
68 69 70 71 72  72 73 74 75 76  68 69 70 71 72  72 73 74 75 76  68 69 70 71 72
68 69 70 71 72  72 73 74 75 76  68 69 70 71 72  72 73 74 75 76  68 69 70 71 72
68 69 70 71 72  72 73 74 75 76  68 69 70 71 72  72 73 74 75 76  68 69 70 71 72
68 69 70 71 72  72 73 74 75 76  68 69 70 71 72  72 73 74 75 76  68 69 70 71 72
68 69 70 71 72  72 73 74 75 76  68 69 70 71 72  72 73 74 75 76  68 69 70 71 72
 */
