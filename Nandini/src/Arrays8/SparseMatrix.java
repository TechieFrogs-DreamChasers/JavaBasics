package Arrays8;

public class SparseMatrix {
    public static void main(String[] args) {
        
        int rows,cols,size,i,j;
        int count =0;

        int[][] arrayElements = {{0,1,0},{0,0,0},{8,0,1}};

        rows = arrayElements.length;
        cols = arrayElements[0].length;

        size = rows*cols;

        for(i=0;i<arrayElements.length;i++){
            for(j=0;j<arrayElements.length;j++)
            if(arrayElements[i][j] == 0){
            count++;
             }
        }

        System.out.println("Number of Zeros in the Matrix: "+ count);
        if(count > (size/2)){
            System.out.println("Given Matrix is a SparseMatrix ");
        }else{
            System.out.println("Given Matrix is not Sparse Matrix ");
        }
    }
    
}
