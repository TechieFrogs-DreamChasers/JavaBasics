package Practice.StringPractice;

public class StringMethods {

    public static void main(String[] args) {
        
        String str = "Hello";
        String str1 = "Hello1";
        String str2 = "HELLO";
        String str3 = "hello";

        String strObj = new String("Hello World");
        String strObj2 = new String("City State");
        String obj3 = new String("Welcome");

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

        String str5 = String.format("Text in str: %s", str);
        System.out.println(str5);

        int index = str.length();
        System.out.println(index);

        int index1 = str.indexOf('o',2);
        System.out.println(index1);

        String str6 = new String("Java Basics").intern(); //without intern if we compare 2 strings it says false because 2 separate 
        String str7 = new String("Java Basics").intern(); //memory allocations.
        System.out.println(str6 == str7);

        System.out.println(str3.isEmpty());  //either lenght()==0, or isEmpty() method.

        System.out.println(String.join("/","20","08","2021"));

        str = String.join(" ", "World");
        System.out.println(str);

        int index3 = strObj2.lastIndexOf('a');
        System.out.println(index3);
        int index4 = strObj2.lastIndexOf('a', 5); //if it is not in that range that will give -1;
        System.out.println(index4);

        String replaceString = str1.replace("Hello", "HELLO");
        System.out.println(replaceString);

        String str7String = "Java Supports Object Oriented Programming";
        System.out.println(str7String.replaceAll("O","o"));

        String str8 = "Example for String Split Method JavaBasics";
        String[] words = str8.split("\\s",4); //number we can change 0,1,2,3,4 or \\only s
        for(String s:words){
        System.out.println(s);
        }

        String[] words1 = str8.split("a", 3);
        for(String s:words1){
            System.out.println(s);
        }

        System.out.println(str8.startsWith("Example"));

        String subString = obj3.substring(2,5); //substring(2);
        System.out.println(subString);

        char[] ch = obj3.toCharArray();
        System.out.println(ch);

        System.out.println("CHar array elements");
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }

        String upperString = obj3.toUpperCase();
        System.out.println(upperString);

        String lowerString = str2.toLowerCase();
        System.out.println(lowerString);

        String str8String = "  Java Basics ";
        System.out.println(str8String);
        System.out.println(str8String.length());
        String s2 = str8String.trim();
        System.out.println(s2);
        System.out.println(s2.length());
        
        String s3 = String.valueOf(str7String);
        System.out.println(s3);



    }
    
}
