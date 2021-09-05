package Assignment;

public class ReversePyramidNum {
    public static void main(String[] args){
        int height = 5;
        for(int i = height;i>=0; --i){
            for(int j = 0; j<= i ; j++){

                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
