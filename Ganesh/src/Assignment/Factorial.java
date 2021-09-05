package Assignment;

public class Factorial {
    public static void main(String[] args){
        int n = 9;
        long f = 1;
       /* for(int i = 1; i <= n ;i++){
            f = n*i;
          }
        System.out.println("Factorial : "+f);
              
    }*/
    int i = 1;
    while(i <= n){
        f = n*i;
        i++;
    }
    System.out.println("Factorial : "+f);
    
}
}
