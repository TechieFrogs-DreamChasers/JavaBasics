package INHEITANCEASGN;

public class SubCounter extends Counter {
    public static void main(String[] args){
        SubCounter sub = new SubCounter();
        sub.increment();
        sub.increment();
        sub.increment();
        System.out.println("i = "+sub.i);
    }
    
}
