public class assignment14 {
    public static void main(String[] args){
        int num = 28;
        int i = 2;
        boolean flag = false;
        
           while (i <= num / 2) {
            
             if (num % i == 0) {
             flag = true;
             break;
}
            ++i;
}
            if (!flag)
            System.out.print(num + " is a prime number.");
            else
            System.out.print(num + " is not a prime number."); 
    }
    
}
