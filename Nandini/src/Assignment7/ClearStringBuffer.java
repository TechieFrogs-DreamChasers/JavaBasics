package Assignment7;

public class ClearStringBuffer {

    public static void main(String[] args) {
        
        StringBuffer string = new StringBuffer();

        string.append("Abc");
        string.append(" Java Developers");

        System.out.println(string);

        System.out.println("deleting string: ");
        string.delete(0, string.length());
        System.out.println(string);
        
    }
    
}
