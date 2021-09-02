import java.util.Scanner;

public class Leftpascalstriangle {
    public static void main(String[] args) {

        int row,r,c; 
        Scanner s = new Scanner(System.in);
        System.out.print("Enter rows : ");
        row = s.nextInt();
        for(r=0;r<=row;r++)
            {
                for(c=0;c<row-r;c++)
                      System.out.print("  ");
                for(c=0;c< r;c++)
                        System.out.print("* ");
                System.out.println();
            }  
            
        for(r=row;r>0;r--)
                    { 
                        for( c=row-r;c>=0;c--)
                            System.out.print("  ");
                        for( c=1;c<r;c++)
                            System.out.print("* ");
                        System.out.println();
                    }
    
    }
}
    

