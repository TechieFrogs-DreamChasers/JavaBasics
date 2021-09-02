public class Fullpyromid {
    public static void main(String[] args) {
        
        for (int i=0; i<5; i++)
        {
 
            
            for (int j=5-i; j>1; j--)
            {
               
                System.out.print(" ");
            }
  
            
            for (int j=0; j<=i; j++ )
            {
                
                System.out.print("* ");
            }
  
           
            System.out.println();
        }
    
    
    
    for (int i=1; i<5; i++)
    {

        
        for (int j=5-i; j>1; j--)
        {
           
            System.out.print(" ");
        }

        
        for (int j=1; j<=i; j++ )
        {
            
            System.out.print(j+" " );
        }

       
        System.out.println();
    }
    char last = 'E', alphabet = 'A';

    for (int i = 1; i <= (last - 'A' + 1); ++i) {
        for (int j=(last - 'A' + 1) - i; j>1; j--)
        {
           
            System.out.print(" ");
        }
      for (int j = 1; j <= i; ++j) {
        System.out.print(" "+ alphabet +" ");
      }
      ++alphabet;

      System.out.println();
    }
  }
}



    

