package Assignment7;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CapitalizeFirstChar {
    public static void main(String[] args) {
        
        
        System.out.println("Enter String : ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        sc.close();

        System.out.println(capitalizeAll(string));
        
        //String str1 = string.substring(0, 1).toUpperCase()+string.substring(1).toLowerCase();

        /*char[] ch = string.toCharArray();
        for(int i=0;i<string.length();i++){
            //System.out.println(ch[i]);
            if(ch[i] == ' '){
                substring = string.substring(i).toUpperCase() + string.substring(1).toLowerCase();
            }

        }*/

        //result = str1 + substring;
        //System.out.println("String is: "+ result);
    }

    public static String capitalizeAll(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
    
        return Pattern.compile("\\b(.)(.*?)\\b")
                .matcher(str)
                .replaceAll(match -> match.group(1).toUpperCase() + match.group(2));
    } 
   
}
