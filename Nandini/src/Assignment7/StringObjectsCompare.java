package Assignment7;

public class StringObjectsCompare {

    public static void main(String[] args) {
         

    //Using equals() method (comparing the content)

    //Using == operator (comparing the object reference)

    //Using compareTo() method (comparing strings lexicographically)

    String str1 = new String("JavaWorld");
    String str2 = new String("HelloProgrammers");
    String str3 = new String("JavaWorld");
    String str4 = new String("HelloProgrammers");
    String str5 = new String("JavaAdvanceLevel");

    System.out.println(str1 == str2);
    System.out.println(str1 == str3);
    System.out.println(str2 == str3);
    System.out.println(str3 == str4);
    System.out.println(str4 == str5);
    //System.out.println(str1 == str1);

    }
    
}
