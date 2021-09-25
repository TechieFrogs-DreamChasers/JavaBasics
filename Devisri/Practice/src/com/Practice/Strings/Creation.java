package com.Practice.Strings;
/*Java Strings are immutable= you cannot change the object itself, but you can change the reference to the object.
* stored in Heap area & String constant Pool(scp)
* String is a final class in java
* public final class String extends Object implements Serializable, Comparable<String>, CharSequence
* Whenever you call new() in JAVA it creates an object in heap.
* String literals will go into String Constant Pool.
* Unlike other Java Objects, instead of managing String object on heap area, they introduced String constant pool.
* One of important characteristic of String constant pool is that it does not create same String object
if there is already String constant in the pool.
*/

public class Creation {
    public static void main(String[] args) {
        //By using String literal
        String s="String as Literal";//points to scp
         /*
        * If the string already exists, the new string is not created.
        * Instead, the new reference, str points to the already existed string (string).
        * If the string doesn't exist, the new string (str is created).
         */
        String s3="String as Literal";
        //By using new operator
        String string=new String("String as Reference");//string constructor is invoked
        System.out.println(s+"  "+string);
        String str=new String();//points to the Heap area
        System.out.println("------: "+str);
        //Here, the value of the string is not directly provided.
        //Hence, a new 'str' string is created even though 'string' is already present inside the memory pool.
        str="String as Reference";//points to heap area
        System.out.println(str+"  "+string);
        str.concat(".");
        System.out.println(str+"  "+string);
        String s1=str.concat(".");
        System.out.println(str+"  "+string+"   "+s1);
        System.out.println(str.length()+"  "+string.length()+"  "+s1.length());//19,19,20
        boolean e=str.equals(string);
        System.out.println("Are str & string equal: "+e);//true
        boolean n=str.equals(s1);
        System.out.println("Are str & s1 equal: "+n);//false
        boolean d=s.equals(string);
        System.out.println("Are string & s equal: "+d);//false
        boolean t=s.equals(s3);
        System.out.println("Are s & s3 equal: "+t);//true
        System.out.println(s==string);//false
        System.out.println(string==str);//false
        System.out.println(str==s1);//false
        System.out.println(s==s3);//true
    }

}
