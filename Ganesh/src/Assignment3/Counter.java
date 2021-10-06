package Assignment3;

public class Counter {
    int i = 3;
    void increment(){
        System.out.println("Value of i = "+i);
    }
}
class Second extends Counter {
   public static void main(String[] args){
        Second s = new Second();
        s.increment();
   }
   
    
}

