package PRACTICE.String;
//String methods
public class Methods {
    public static void main(String[] args){
        String s = "Learn share Learn";
        String s1 = "Learn share learn";
        System.out.println(s.length());//17
        System.out.println(s.charAt(3));//r
        System.out.println(s.substring(6,11));//share
        System.out.println(s.substring(6));//share Learn
        System.out.println(s.indexOf('n'));//4
        String s2 = "   Share  ";
        System.out.println(s.concat(s2));
        System.out.println(s.indexOf("Learn"));//0
        System.out.println(s.indexOf("Learn",6));//12
        System.out.println(s.lastIndexOf("rn",6));//3 starting from 6 searching backward
        System.out.println(s.lastIndexOf("ea"));//13
        System.out.println(s.equals(s1));//false
        System.out.println(s.equalsIgnoreCase(s1));//true
        System.out.println(s.equals("Learn share Learn"));//true
        System.out.println("Bye".equals("Bye"));
        System.out.println(s.compareTo(s1));//-32
        System.out.println("Bye".compareToIgnoreCase("bye"));//0 -- means equal,lexicographically compare
        System.out.println(s.toLowerCase());//learn share learn
        System.out.println(s.toUpperCase());//LEARN SHARE LEARN
        
        System.out.println(s2.trim());//share --leading and trailing spaces are trimmed
        String newString=s.replace("ea","ar");//Larrn share Larrn
        System.out.println(newString);
        newString = s.replace('e','f');
        System.out.println(newString);
        newString = s.replaceAll("L", "Q");
        System.out.println(newString);//Qearn share Qearn
        System.out.println(s.codePointAt(6));//115 -ascii of s
        System.out.println(s.codePointBefore(6));//32 --space
        System.out.println(s.codePointCount(0,4));
        System.out.println( s.subSequence(3, 5));//returns character sequence rn
        System.out.println(s.contains("rn"));//true
        System.out.println(s.startsWith("L"));//true
        System.out.println(s.startsWith("rn", 3));//checks rn starts at position 3--true
        System.out.println(s.endsWith("rn"));//true
        char ch[] = new char[10];
        s.getChars(3, 6, ch, 0); //copies character from string s(from pos 3 to 6) to character array
        System.out.println(ch);
        ch = s.toCharArray();//all characters in string to char array
        System.out.println(ch);
        int ascii[] = { 65, 66, 67, 68};
        String s3 = new String(ascii, 1, 3);//int[] codepoints array,offset,count-->characters
        System.out.println(s3);


    }
}
