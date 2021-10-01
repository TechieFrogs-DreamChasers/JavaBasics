package Assignment7;

public class ClearUsingObject {
    public static void main(String[] args) {
        
        StringBuffer string = new StringBuffer();
        string.append("Hello ");
        string.append("Team ");
        string.append(string);
        System.out.println(string);

        string = new StringBuffer();
        System.out.println("After creating an object");
        System.out.println(string);
    }
    
}
