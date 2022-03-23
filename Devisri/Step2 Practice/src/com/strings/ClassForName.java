package com.strings;

public class ClassForName {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class c=Class.forName("com.strings.ReplaceChars");
        System.out.println(c);
        ReplaceChars rep=(ReplaceChars) c.newInstance();
        rep.show();
    }
}
