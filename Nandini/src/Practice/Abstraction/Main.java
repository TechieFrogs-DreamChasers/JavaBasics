package Practice.Abstraction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sample");
        Bank b ;
        b = new Account1();
        System.out.println(b.getAccountdetails());
        
        b = new Account2();
        System.out.println(b.getAccountdetails());
    }
}
