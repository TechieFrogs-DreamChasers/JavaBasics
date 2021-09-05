package Assignment;

public class CheckAlphabet {
    /*public static void main(String[] args){
        char ch = '*';
        char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
        'n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] beta = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
            'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
            if(ch = alpha || ch = beta){
                System.out.println(ch+" is Alphabet");
            }
            else{
                System.out.println(ch+" is not Alphabet");
            }
    }*/
    public static void main(String[] args){
        char ch = '*';
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println(ch + " is an Alphabet");
        }
        else{
            System.out.println(ch+" is a character");
        }
    }
}
