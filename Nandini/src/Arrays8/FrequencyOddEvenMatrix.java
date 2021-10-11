package Arrays8;

public class FrequencyOddEvenMatrix extends RandomGenerateMatrix {
    public static void main(String[] args) {
        
        int even,odd,rows,cols,i,j;

        int[][] matrix = random();
        
        even = 0;
        odd = 0;
        rows = matrix.length;
        cols = matrix[0].length;
        
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                if(matrix[i][j]%2 == 0){
                    even++;
                }else{
                    odd++;
                }    
            }   
        }
        System.out.println("Even Frequency: "+ even);
        System.out.println("Odd Frequency: "+ odd);
    }
    
}
