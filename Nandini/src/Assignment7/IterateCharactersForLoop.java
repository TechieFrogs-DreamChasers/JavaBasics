package Assignment7;

public class IterateCharactersForLoop {

    public static void main(String[] args) {
        
        String string = "Java Developers";
        iteration(string);
        
    }

    static void iteration(String string){

        char[] ch = string.toCharArray();

        for(int i=0; i<string.length();i++){
            System.out.print(ch[i] + "  ");
        }
    }
    
}
