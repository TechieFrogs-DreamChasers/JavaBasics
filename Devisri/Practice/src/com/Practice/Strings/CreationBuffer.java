package com.Practice.Strings;
/*
*Introduced in Java 1.2
*StringBuffer is much alike the String class, but with mutability features.
*Unlike Strings where the length and memory allocation are final.
*StringBuffer has existing methods to modify these properties.
*java.lang.StringBuffer extends AbstractStringBuilder abstract class.
*StringBuffer inherits clone(), equals(),
finalize(), getClass(), hashCode(), notify() and notifyAll() methods from java.lang.Object super class.
*StringBuffer implements CharSequence, Appendable and Serializable interfaces.
*StringBuffer capacity() method can be used to retrieve the memory available for
new character sequences to be added, beyond which the allocation will occur.
*Compared to StringBuilder Class, StringBuffer operates slower due to synchronization.
 */
public class CreationBuffer {
    public static void main(String[] args) {
        //This is also a constructor which takes String as parameter
        StringBuffer sb=new StringBuffer("Hello this is String Buffer!!!");
        System.out.println(sb);
        //reverse(): Reverses the existing String or character sequence content in the buffer and returns it.
        // The object must have an existing content or else a NullPointerException is thrown.
        System.out.println( sb.reverse());
        //Constructor
        //Creates a StringBuffer with empty string and 16 reserved characters by default.
        StringBuffer sb1 = new StringBuffer();
        //Creates a StringBuffer with the passed argument as the size of the empty buffer.
        StringBuffer sb2 = new StringBuffer(20);
        //Creates a StringBuffer with the passed String as the initial content of the buffer.
        // 16 characters are pre-allocated, not including the char sequence, for modification purposes.
        StringBuffer sb3 = new StringBuffer("Hello World!");
        //System.out.println(sb1);
        //System.out.println(sb2);
        System.out.println(sb3);
        //Methods
        //length(): Returns the StringBuffer object’s length.
        StringBuffer sb4=new StringBuffer("This is StringBuffer Class");
        System.out.println("Length of the String: "+sb4.length());//26
        //capacity(): Returns the capacity of the StringBuffer object.
        //int length= sb4.length();
        int capacity= sb4.capacity();//returns no of characters stored along with 16 already assigned characters
        System.out.println("Capacity of the String: "+capacity);//26+16=42

        //append(): appends the specified argument string representation at the end of the existing String Buffer.
        // This method is overloaded for all the primitive data types and Object.
        sb4.append(". This is mutable. ");
        System.out.println(sb4);
        StringBuffer sb5=sb4;
        //sb5.append(3);//appends integer value 3 at the end of the string
        System.out.println(sb5);
        System.out.println(sb4.hashCode());//1747585824
        System.out.println(sb5.hashCode());//1747585824
        //insert(): insert() method takes two parameters –
        // the index integer value to insert a value and the value to be inserted.
        // The index tells StringBuffer where to insert the passed character sequence.
        // Again this method is overloaded to work with primitive data types and Objects.
        sb5.insert(45,"class.");
        System.out.println(sb5);
        //delete(int startIndex, int endIndex): accepts two integer arguments.
        // The former serves as the starting delete index and latter as the ending delete index.
        // Therefore, the character sequence between startIndex and endIndex–1 are deleted.
        // The remaining String content in the buffer is returned.
        sb5.delete(43,44);//. is deleted
        System.out.println(sb5);
        //deleteCharAt(int index): deletes single character within the String inside the buffer.
        // The location of the deleted character is determined by the passed integer index.
        // The remaining String content in the buffer is returned.
        sb5.deleteCharAt(27);//space between . and T is deleted
        System.out.println(sb5);
        System.out.println("Length: "+sb5.length()+"   Capacity: "+sb5.capacity());
        sb5.ensureCapacity(80);
        System.out.println("Capacity after min 80: "+sb5.capacity());//86
        sb5.ensureCapacity(90);
        System.out.println("Capacity after min 90: "+sb5.capacity());//(86*2)+2=174
        //replace(int startIndex, int endIndex, String str): Accepts three arguments:
        // first two being the starting and ending index of the existing String Buffer.
        // Therefore, the character sequence between startIndex and endIndex–1 are removed.
        // Then the String passed as third argument is inserted at startIndex.
        StringBuffer sb6=new StringBuffer("String   Buffer class");
        sb6.replace(7,9,"");
        System.out.println(sb6);//String Buffer class
        /*
        Most of the time we don’t need to use StringBuffer
        because String is immutable, and we can use StringBuilder in single threaded environments.
        You should use StringBuffer only when multiple threads are modifying its contents.
        */

    }
}
