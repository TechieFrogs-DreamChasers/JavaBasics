package Arrays8;

public class Add2MatricesJagged {
    public static void main(String[] args) {
        
        int i,j;

        int[][] matrix = new int[3][]; 
        matrix[0] = new int[4];
        matrix[1] = new int[3];
        matrix[2] = new int[2];
        int count =0;
        for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[i].length;j++){
                matrix[i][j] = count++;
            }
            System.out.println(" ");
        }
        


        int[][] matrix1 = new int[3][];
        matrix1[0] = new int[4];
        matrix1[1] = new int[3];
        matrix1[2] = new int[2];
        //int count =0;
        for(i=0;i<matrix1.length;i++){
            for(j=0;j<matrix1[i].length;j++){
                matrix1[i][j] = count++;
            }
            System.out.println(" ");
        }

        System.out.println("Matrix 1 Original Form ");
        for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
         }

        System.out.println("Matrix 2 Original Form ");
        for(i=0;i<matrix1.length;i++){
            for(j=0;j<matrix1[i].length;j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
         }



        int[][] result = new int[3][];
        result[0] = new int[4];
        result[1] = new int[3];
        result[2] = new int[2];

       
        System.out.println("Addition Of Jagged Matrices ");
        for(i=0;i<result.length;i++){
            for(j=0;j<result[i].length;j++){
                result[i][j] = matrix[i][j]+matrix1[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
         }

    }
    
}
