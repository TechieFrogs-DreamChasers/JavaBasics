package Assignments;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        /*System.out.println("Enter a character :");
        Scanner sc =new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
                System.out.println(ch + " is an vowel");
            else
                System.out.println(ch + " is a consonant");
        sc.close();*/
        Scanner sc =new Scanner(System.in);
        char ch;
        do{
        System.out.println("Enter a Character: ");
        while(sc.hasNextInt() ){
            //int num = sc.nextInt();
            System.out.println("Please enter avalid character ");
        }
         ch = sc.next().charAt(0);
    
        //System.out.println((int)ch);
    

        }while(!((ch<=65 && ch>=90)||(ch>=97 && ch<=122)));
        switch(ch){
            case 'a','e','i','o','u'->
            System.out.println(ch+" is a lower case vowel");
            case 'A','E','I','O','U' ->
            System.out.println(ch+" is a upper case vowel");
                        
            default->
             System.out.println(ch+"is Consonant");
            
            }
            sc.close();
        
        
    

    }
}
    
        

    
