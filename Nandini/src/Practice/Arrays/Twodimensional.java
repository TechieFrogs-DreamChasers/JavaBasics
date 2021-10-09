package Practice.Arrays;

public class Twodimensional {
    public static void main(String[] args) {
        
        int array[][] = {{6,7,10},{12,16,12},{2,8,9}};

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println(); 
        }
       
    }
    
}
