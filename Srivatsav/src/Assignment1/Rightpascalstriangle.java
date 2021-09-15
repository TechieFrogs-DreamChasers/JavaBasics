package Assignment1;

import java.util.Scanner;

public class Rightpascalstriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Rows : ");
        int rows = scan.nextInt();
   
        int numberOfRows, numberOfColumns;
    
        for (numberOfRows = 1; numberOfRows<=rows; numberOfRows++)
        {
        
            for (numberOfColumns = 1; numberOfColumns <= numberOfRows; numberOfColumns++)
            {
            
                System.out.print("*");
            }
        
            System.out.println();
    }
    
    for (numberOfRows = rows; numberOfRows>=1; numberOfRows--)
    {
        for (numberOfColumns = 1; numberOfColumns < numberOfRows; numberOfColumns++)
        {
            
            System.out.print("*");
        }
        
        System.out.println();
    }
    }
    
}
