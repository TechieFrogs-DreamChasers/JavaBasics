package Arrays8;

public class TransposeOfMatrix extends RandomGenerateMatrix {
    public static void main(String[] args) {
        
        int[][] matrix = random();
        int[][] matrix1 = new int[3][3];

        int i,j,rows,cols;
        rows = matrix.length;
        cols = matrix[0].length;

        System.out.println();
        System.out.println("Matrix Transpose Form ");
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                matrix1[i][j] = matrix[j][i];
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
