package Assignment;

public class Alphabet {
    public static void main(String[] args){
        char alpha = 'U';
        if((alpha == 'a') || (alpha == 'e') || (alpha == 'i') || (alpha == 'o') || (alpha == 'u') || (alpha == 'A') || (alpha == 'E')
        || (alpha == 'I') || (alpha == 'O') || (alpha == 'U') ){
            System.out.println(alpha+": Alphabet is vowel");
        }
        else{
            System.out.println(alpha+": Alphabet is Consonant");
        }
    }
   /* public static void main(String[] args){
        char ch = 'A';
        switch(ch){
        case 'a','A','e','E','i','I','o','O','u','U':{
            System.out.println("Alphabet is vowel");
            break;
        }
        default: 
        System.out.println("Alphabet is Consonent");
    }


    }*/
    
}
