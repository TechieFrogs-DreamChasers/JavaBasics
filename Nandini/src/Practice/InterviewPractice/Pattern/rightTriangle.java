package Practice.InterviewPractice.Pattern;

public class rightTriangle {
    public static void main(String[] args) {
        
        int row = 4;
        int i,j;

        for(i=0;i<=row;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }



        System.out.println(" ");



        for(i=0;i<=row;i++){
            for(j=(row-1);j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }


        for(i=row-1;i>=0;i--){
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
