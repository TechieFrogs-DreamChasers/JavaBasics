package Assignment;

public class Gcd {
    public static void main(String[] args){
        int n1 = 12;
        int n2 = 15;
        int gcd = 1;

        for(int i = 1; (i <= n1 && i <= n2); ++i){
            if(n1%i == 0 && n2%i == 0){
                gcd = i;
               }
            }   
            System.out.println("lcm of : n1 & n2 "+gcd);            
        }
         

        }
