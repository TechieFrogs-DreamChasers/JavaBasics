package Assignment4;

public class Main {
    
    public static void main(String[] args) {

        PrintNumber pn = new PrintNumber();

        int a = 2;
        double b = 4.5;
        float c = 3.4f;
        
        System.out.println("         ");
        pn.printn(a,b);
        System.out.println("         ");
        pn.printn(c,b);
        System.out.println("         ");
        pn.printn(b,3L);
        System.out.println("         ");
        pn.printn(2L, a);



    }
}
