package Assignment7;

public class IterationCharacterForEachLoop {
    
    public static void main(String[] args) {
        
        String str = " Java Program";
        iteration(str);
        //System.out.println();
    }

    static void iteration(String str){

        char[] ch = str.toCharArray();

        for(char c:ch){
            System.out.print(c + " ");

        }

    }

}
