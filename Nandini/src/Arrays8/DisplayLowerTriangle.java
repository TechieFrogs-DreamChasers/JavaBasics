package Arrays8;

public class DisplayLowerTriangle extends RandomGenerateMatrix {
    public static void main(String[] args) {
        int rows,cols,i,j;

        //Using Random Method from RandomGenerateMatrix Class To generate Random Number.
        int[][] matrix1 = random();

        rows = matrix1.length;
        cols = matrix1[0].length;

        if(rows != cols){
            System.out.println("Matrix Should be a Square Matrix ");
        }else{

            System.out.println("Matrix LowerTriangle Form ");
            for(i=0;i<matrix1.length;i++){
                for(j=0;j<matrix1.length;j++){
                    if(j>i){
                        matrix1[i][j] = 0;
                    }
                    System.out.print(matrix1[i][j]+ " ");
                }
                System.out.println();
            }
        }

    }
    
}
