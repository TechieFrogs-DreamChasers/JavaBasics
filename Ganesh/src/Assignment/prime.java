package Assignment;

public class prime {
    public static void main(String[] args){
        int n = 11;
        int k = 0;
        for(int  i = 1;i <= n;i++){
            if(n%i == 0){
                k = k+i;
            }                      
        }
        if(k == n+1){
            System.out.println("IS PRIME NUMBER");
            }
        else{
            System.out.println("Not a Prime Number");
        }
    }
    
}
