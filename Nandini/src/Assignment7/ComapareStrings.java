package Assignment7;

public class ComapareStrings {
    public static void main(String[] args) {
        
    
    String str1 = "JavaBasics";
    String str2 = "JavaBasics";
    String str3 = "Hello World";

    String str4 = new String("JavaBasics");
    String str5 = new String("JavaBasics");

    //Using equals() method (comparing the content)

    //Using == operator (comparing the object reference)

    //Using compareTo() method (comparing strings lexicographically)

    System.out.println(str1 == str2); //same content 

    System.out.println(str1 == str3); //diff content

    System.out.println(str1 == str4); //same content but diff location

    System.out.println(str2 == str4);

    System.out.println(str4 == str5);


}  
    
}
