package Arrays8;

public class BothMatricesEqual {
    public static void main(String[] args) {
        
        int matrix1[][] = {{1,2,3},{3,4,6},{6,4,2}};
        int matrix2[][] = {{1,2,3},{3,4,7},{6,4,2}};
        boolean flag = true;

        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int i,j;
        
        System.out.println("First Matrix ");
        for(i=0;i<matrix1.length;i++){
            for(j=0;j<matrix2.length;j++){
                System.out.print(matrix1[i][j]+" ");  
            }
            System.out.println();
        }

        System.out.println("Second Matrix ");
        for(i=0;i<matrix2.length;i++){
            for(j=0;j<matrix2.length;j++){
                System.out.print(matrix2[i][j]+" ");  
            }
            System.out.println();
        }

        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                  
                if(matrix1[i][j] != matrix2[i][j]){
                   flag = false;  
                   break; 
                }
            }
            
        }

        if(flag)
        System.out.println("Both Matrices are equal");
        else
        System.out.println("Both Matrices are not equal");
    }
    
}
