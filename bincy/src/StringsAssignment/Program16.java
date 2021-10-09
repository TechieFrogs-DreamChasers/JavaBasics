package StringsAssignment;

import java.util.Scanner;

//Everyword of astring to uppercase
public class Program16 {
    public static void main(String[] args){
        System.out.println("Enter a string: ");
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine();
        obj.close();

        String[] words = str1.split("\\s") ;
        String capital = "";

        for(int i=0; i<words.length; i++){
            capital+= words[i].toUpperCase()+" " ;
        }
        System.out.println(capital);

    }
}
