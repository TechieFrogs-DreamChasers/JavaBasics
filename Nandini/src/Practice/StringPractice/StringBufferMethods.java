package Practice.StringPractice;


public class StringBufferMethods {
    public static void main(String[] args) {
        
        StringBuffer str = new StringBuffer();
        System.out.println(str.capacity());


        //append()
        System.out.println();
        System.out.println("append method");
        str.append("Hello");
        System.out.println(str.capacity());

        str.append("  JavaBasics");
        System.out.println(str);

        //insert()
        System.out.println();
        System.out.println("insert method");
        str.insert(2," Programmimg ");//insert the given string at that position
        System.out.println(str);

        //replace()
        System.out.println();
        System.out.println("replace method");
        str.replace(2, 4, " Language ");
        System.out.println(str);

        //delete()
        System.out.println();
        System.out.println("delete method");
        str.delete(2,23);
        System.out.println(str);

        System.out.println();
        System.out.println("deleteCharat method");
        str.deleteCharAt(1);
        System.out.println(str);
        //System.out.println(str.capacity());

        //reverse()
        /*str.reverse();
        System.out.println(str);*/

        //capacity()
        System.out.println();
        System.out.println("Capacity method");
        System.out.println(str.capacity());
        str.delete(5,17);

        System.out.println(str);
        System.out.println(str.capacity());

        System.out.println();

        //ensurecapacity()
        System.out.println();
        System.out.println("EnsureCapacity method");
        StringBuffer str1 = new StringBuffer();
        System.out.println(str1.capacity());

        str1.append("JavaBasics");
        System.out.println(str1);
        System.out.println(str1.capacity());

        str1.ensureCapacity(13);
        System.out.println(str1.capacity()); //still below 16 it prints 16

        str1.ensureCapacity(35);  //(oldcapacity*2)+2
        System.out.println(str1.capacity()); //if i give below or equal to 34 it prints 34.
        //but if i give above 34 it prints exact capacity value like 35-35,40-40.

        str1.append(" Programming Language");
        System.out.println(str1);
        System.out.println(str1.capacity());

        str1.ensureCapacity(50);
        System.out.println(str1.capacity());

        //charAt()
        System.out.println();
        System.out.println("CharAt method");
        System.out.println(str1.charAt(11));

        //length()
        System.out.println();
        System.out.println("length method");
        System.out.println(str1.length());

        //substring(beginindex)
        System.out.println();
        System.out.println("substring(begin) method");
        System.out.println(str1.substring(5));

        //substring(begin,end)
        System.out.println();
        System.out.println("substring(begin,end) method");
        System.out.println(str1.substring(4, 18));

        /*//appendcodepoint
        System.out.println();
        System.out.println("AppendcodePoint method");
       // System.out.println(str1.appendCodePoint());*/

       //Trimtosize()
       System.out.println();
        System.out.println("Trim to Size");
       System.out.println("Before Applying trimtosize: "+ str1.capacity());
       str1.trimToSize();
       System.out.println("After Applying trimtosize: "+ str1.capacity());

       //CodePoint
        System.out.println();
        System.out.println("CodePoint method");
        int unicodeValue = str1.codePointAt(6);
        System.out.println(unicodeValue); //s unicode value

        





    }
}
