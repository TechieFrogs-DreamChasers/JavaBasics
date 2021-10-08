//Add two matrices Jagged Array
public class Program32 {
    public static void main(String[] args) {
        int[][] mat1 = new int[3][];
        int[][] mat2 = new int[3][];
        int[][] sum = new int[3][];
        mat1[0] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat1[1] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat1[2] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat2[0] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat2[1] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat2[2] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        sum[0] = new int[3];
        sum[1] = new int[2];
        sum[2] = new int[3];
        System.out.println("Matrix-1: ");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(mat1[i][j] + "  ");
            }
            System.out.println(" ");
        }
        System.out.println("Matrix-2: ");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                System.out.print(mat2[i][j] + "  ");
            }
            System.out.println(" ");
        }
        System.out.println("Addition: ");
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
/*
Matrix-1:
38  83  8
78  66
29  35  31
Matrix-2:
55  30  49
44  78
82  36  88
Addition:
93 113 57
122 144
111 71 119

 */
