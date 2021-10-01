package Assignment7;

public class ClearUsingSetLength {
    public static void main(String[] args) {
    
    StringBuffer string = new StringBuffer();
    string.append("Hello ");
    string.append("Java");
    string.append(" Programmers");

    System.out.println(string);
  
    System.out.println("Updated String Length: ");
    string.setLength(0);

    System.out.println(string);



    }
}
