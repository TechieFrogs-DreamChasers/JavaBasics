package assignment;

public class vowel {
    public static void main ( String[]args){
        char c = 'R';
       /* switch (c){
            case  'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':

          System.out.println(" The given alphabet is a vowel ");
            break;
            default:
            System.out.println(" The given alphabet is a consonant");
        }*/

        if ( ( c == 'a' ) || ( c == 'e') || ( c=='i') || (c=='o') || ( c=='u') || ( c =='A')  || ( c =='I') || ( c=='O') || (c=='U'))
        System.out.println(" The given alphabet is a vowel"); 
        else
            System.out.println(" The given aplhabet is a consonant");

        }
  
    }
    

