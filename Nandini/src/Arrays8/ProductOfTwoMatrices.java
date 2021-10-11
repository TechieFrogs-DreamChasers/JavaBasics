package Arrays8;

public class ProductOfTwoMatrices extends RandomGenerateMatrix {
    public static void main(String[] args) {
        
        int[][] matrix1 = random();
        System.out.println("Second");
        int[][] matrix2 = random();
        int[][] matrix3 = new int[3][3];

        int i,j,rows,cols;
        rows = matrix1.length;
        cols = matrix1[0].length;

        System.out.println("Product Of Two Matrices ");
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                matrix3[i][j] = matrix1[i][j] * matrix2[i][j];
                System.out.print(matrix3[i][j]+ " ");
            }
                System.out.println();
        }

    }
}
