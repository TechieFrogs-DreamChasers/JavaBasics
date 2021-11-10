package PRACTICE.Coding.Coding;

import java.util.Scanner;

public class Coding1 {
    public static void main(String []args){
        System.out.print("Enter a string:  ");
        Scanner scanerObj = new Scanner(System.in);
        String newString = scanerObj.nextLine();//Accepting string
        scanerObj.close();
        
        char ch;
        int v=0,c=0;//Initialising counts
        char vowel[] = new char[newString.length()];//Initialising vowel array
        char consonent[] =new char[newString.length()];//Initializing cosonent array
        int spaces=0;


        for(int i =0;i<newString.length();i++){//Traversing through array
            ch = newString.charAt(i);//taking  each character to ch
            switch(ch){//check whether Vowel or consonent or space
                case 'a','A':
                case 'e','E':
                case 'i','I':
                case 'o','O':
                case 'u','U':
                 vowel[v++] = ch;//Assigning to vowel array
                 break;
                case ' ' :
                    spaces++;//count spaces
                    break;
                default:
                    consonent[c++] =ch;  //Assigning to consonent array      

            }


        }
        System.out.println("Vowels: "+v);//vowel count
        for(int i=0;i<vowel.length;i++){
            System.out.print(vowel[i]+" ");//vowel array
        }
        System.out.println("");
        System.out.println("Cosonent: "+ c);
        for(int i=0;i<consonent.length;i++)
        System.out.print(consonent[i]+" ");

        System.out.println("");
        System.out.println(("Spaces: "+ spaces));
    }
}
