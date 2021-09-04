package assignment;

public class prime {
    public static void main(String[]args){
        int n = 11;
        int i = 2; 
        boolean f=false;
        while(i<=n / 2){
            if( n%i ==0)
            
            f=true;
            break;
      
        }
        i++;

        if (!f){
            System.out.println(" number is a prime number");
        }
        else{
            System.out.println(" number is not a prime number");
        }
    }
    
}
