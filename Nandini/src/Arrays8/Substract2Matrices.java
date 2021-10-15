package Arrays8;

public class Substract2Matrices {
    public static void main(String[] args) {
        
        int rows;
        int cols;int i,j;
        int[][] matrix1 = {{2,1,3},{2,5,7},{8,9,5}};
        int[][] matrix2 = {{1,0,2},{2,4,7},{2,9,4}};

        rows = matrix1.length;
        cols = matrix1[0].length;

        int[][] substract = new int[rows][cols];

        System.out.println("Difference Between Two Arrays: ");
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                substract[i][j] = matrix1[i][j] - matrix2[i][j];
                System.out.print((substract[i][j] + " "));
            }
            System.out.println();
        }
      
        
    }
    
}
