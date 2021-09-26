package Practice.StringPractice;

public class StringMethods {

    public static void main(String[] args) {
        
        String str = "Hello";
        String str1 = "Hello1";
        String str2 = "Hello";
        String str3 = "hello";

        String strObj = new String("Hello World");
        String strObj2 = new String("City State");
        String obj3 = new String("Wekcome");

        System.out.println(str.charAt(3));

        System.out.println(str.compareTo(str1));
        System.out.println(str1);

        System.out.println(strObj+strObj2);
        System.out.println(str.concat(strObj2));

        System.out.println(strObj2.contains("ate"));

        System.out.println(obj3.endsWith("come"));

        System.out.println(str.equals(str1));
        System.out.println(str.equals(str2));

        System.out.println(str.equalsIgnoreCase(str3));
        System.out.println(str.equalsIgnoreCase(str1));

        //getbytes and getchars will return the byte and char values.
        //getBytes,getChars

        


    }
    
}
