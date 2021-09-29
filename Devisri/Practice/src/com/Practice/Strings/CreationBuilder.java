package com.Practice.Strings;

/*java 1.5 version created StringBuilder class
 *non-synchronized methods
 * mutable objects are present
 *If execution speed and performance is a factor, StringBuilder class can be used in place of StringBuffer.
 * append() and insert() are overloaded within StringBuilder in order to accommodate different data type.
 * (1) converts a given data to a string then
 * (2) appends or inserts the characters of that string to the string builder.
 * Java StringBuilder append() method always adds these characters at the end of the builder;
 * insert() method inserts character(s) at a specified point.
 */
public class CreationBuilder {
    public static void main(String[] args) {
        //Constructors-4
        //StringBuilder()-Creates an empty string builder with a default capacity of 16 (16 empty elements).
        StringBuilder sb = new StringBuilder();
        //System.out.println(sb);
        //StringBuilder(CharSequence cs)-Constructs a string builder containing the
        //same characters as the specified CharSequence, plus an extra 16 empty elements trailing the CharSequence.
        StringBuilder sb2 = new StringBuilder("Char Sequence");
        System.out.println(sb2);
        //StringBuilder(int initCapacity)-Creates an empty string builder with the specified initial capacity.
        StringBuilder sb3 = new StringBuilder(20);
        //System.out.println(sb3);
        //StringBuilder(String s)	Creates a string builder
        // whose value is initialized by the specified string, plus an extra 16 empty elements trailing the string.
        StringBuilder sb4 = new StringBuilder("Hello");
        System.out.println(sb4);
        //Methods
        //length()
        System.out.println("The length: " + sb2.length());//13
        //capacity()
        System.out.println("The capacity: " + sb2.capacity());//13+16=29
        //append()
        StringBuilder sb5 = new StringBuilder("This is StringBuilder");
        System.out.println(sb5);
        sb5.append("class");
        System.out.println(sb5);//This is StringBuilderclass
        sb5.insert(21, " ");
        System.out.println(sb5);//This is StringBuilder class
        //replace(int startIndex, int endIndex, String str)
        StringBuilder sb6 = new StringBuilder("This is StringBuffer Class");
        System.out.println(sb6);//This is StringBuffer Class
        sb6.replace(14, 20, "Builder");
        System.out.println(sb6);//This is StringBuilder Class
        //delete(int startIndex, int endIndex)
        StringBuilder sb7 = new StringBuilder("This is StringBufferBuilder Class.");
        System.out.println(sb7);//This is StringBufferBuilder Class.
        sb7.delete(14, 20);
        System.out.println(sb7);//This is StringBuilder Class.
        //reverse()
        StringBuilder sb8 = new StringBuilder("Woof Woof");
        System.out.println(sb8);//Woof Woof
        System.out.println(sb8.reverse());//fooW fooW
        System.out.println(sb8);//fooW fooW
        //ensureCapacity()-
        // method of StringBuilder class ensures that the given capacity is the minimum to the current capacity.
        // If it is greater than the current capacity,
        // it increases the capacity by (old_capacity*2)+2 e.g. at current capacity 16,
        // it becomes (16*2)+2 which is 34.
        System.out.println("Before ensureCapacity(): " + sb2.capacity());//29
        sb2.ensureCapacity(5);
        System.out.println("After ensureCapacity(): " + sb2.capacity());//29
        //(29*2)+2=60
        sb2.ensureCapacity(60);
        System.out.println("New ensureCapacity(): " + sb2.capacity());//60
    }
}
