package Assignment7;

import java.util.Arrays;

public class Anagram {

    static boolean twoStrings(String s1,String s2){
  
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        if(s1.length() == s2.length()){
            Arrays.sort(str1);
            Arrays.sort(str2);
    }
        return Arrays.equals(str1,str2);
    }

    public static void main(String[] args) {


        String string1 = "JavaBasics";
        String string2 = "BasicsJava";
        System.out.println(twoStrings(string1,string2));
        
        
    }
    
}
