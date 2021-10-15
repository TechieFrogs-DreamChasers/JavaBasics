package Arrays8;

public class UpperTriangularMatrix extends RandomGenerateMatrix {
    public static void main(String[] args) {

        //Using random Method from RandomGenerateMatrix to generate random Matrix
        int[][] matrix = random();

        int rows,cols,i,j;
        rows = matrix.length;
        cols = matrix[0].length;

        if(rows != cols){
            System.out.println("Matrix should a Square Matrix ");
        }else{
            System.out.println("Upper Triangular Matrix ");
            for(i=0;i<matrix.length;i++){
                for(j=0;j<matrix.length;j++){
                    if(j<i){
                        matrix[i][j] = 0;   
                    }
                    System.out.print(matrix[i][j]+" ");
                    
                }
                System.out.println();
            }
        }
        
    }
    
}
