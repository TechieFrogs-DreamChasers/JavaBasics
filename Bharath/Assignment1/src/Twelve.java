public class Twelve {
    public static void main(String[] args) {
        int l1 = 12;
        int l2 = 15;
        int gcd = 1;

        for(int i = 1; (i <= l1 && i <= l2); ++i){
            if(l1%i == 0 && l2%i == 0){
                gcd = i;
               }
            }   
            int lcm = (l1*l2) / gcd; 
            System.out.println("lcm of : l1 & l2 "+lcm);            
        
    }
    
}
