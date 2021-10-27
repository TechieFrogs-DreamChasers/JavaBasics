package Arrays8;

public class SumOfEachRowCol extends RandomGenerateMatrix {
    public static void main(String[] args) {
        
        int[][] matrix = random();

        int rows,cols,i,j;
        rows = matrix.length;
        cols = matrix[0].length;
        int sumRow = 0;
        int sumCol = 0;
        
        System.out.println();
        for(i = 0; i < rows; i++){    
            sumRow = 0;    
            for(j = 0; j < cols; j++){    
              sumRow = sumRow + matrix[i][j];    
            }    
            System.out.println("Sum of " + (i+1) +" row: " + sumRow);    
        }  

        System.out.println();
        for(i=0;i<cols;i++){
            sumCol = 0;
            for(j=0;j<rows;j++){
                sumCol = sumCol + matrix[j][i]; 
            } 
            System.out.println("Sum Of "+ (i+1) + " Col: "+ sumCol);  
        }
    }
    
}
