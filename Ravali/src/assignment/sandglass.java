package assignment;

public class sandglass {
    public static void main(String[]args){
        int rows = 6;
    
    
        for(int i=0; i<rows; i++){
            
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            
            for(int k=i; k<rows; k++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
        
        
        
            for(int i=0; i<=5; i++){
                for(int j=i; j<=5; j++){
                    System.out.print(" ");
                }
                for( int k=1; k<=i; k++){
                    System.out.print("* ");
                }
    System.out.println();
            }
        }
    }
    

