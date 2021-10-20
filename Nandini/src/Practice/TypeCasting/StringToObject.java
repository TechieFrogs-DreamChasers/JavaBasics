package Practice.TypeCasting;

import java.io.IOException;

public class StringToObject {
    public static void main(String[] args) throws Exception {

        /*String s = "string";

        Object obj = s;

        System.out.println(obj);*/

        Class c = Class.forName("Java.lang.String ");
        //Class c = Class.forName("Java.lang.String");

        System.out.println("class Name: " + c.getName());
        System.out.println("Super Class Name: "+ c.getSuperclass().getName());

        
    }
    
}
