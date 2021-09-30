package Assignment7;

public class EqualsCompare {

    public static void main(String[] args) {
        
        String str1 = "JavaWorld";
        String str2 = "AdvanceJava";
        String str3 = "JavaWorld";
        String str4 = new String("JavaWorld");
        String str5 = new String("AdvanceJava");
        String str6 = new String("HelloWorld");

        //Using equals() method (comparing the content)

        //Using == operator (comparing the object reference)

        //Using compareTo() method (comparing strings lexicographically)

        System.out.println(str1.equals(str2));

        System.out.println(str1.equals(str3));

        System.out.println(str1.equals(str4));

        System.out.println(str2.equals(str5));

        System.out.println(str3.equals(str6));
    }
    
}
