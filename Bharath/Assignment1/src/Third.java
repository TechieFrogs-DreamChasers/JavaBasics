public class Third {
    public static void main(String[] args) {
    float a = 2f, 
    b = 3.15f;

    System.out.println(a);
    System.out.println(b);

    float c = a;
    a = b;
    b = c;
    System.out.println("after");
    System.out.println(a);
    System.out.println(b);

        
    }
    
    
}
