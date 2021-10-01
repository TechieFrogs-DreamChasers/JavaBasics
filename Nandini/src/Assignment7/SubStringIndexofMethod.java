package Assignment7;

public class SubStringIndexofMethod {

    public static void main(String[] args) {
        
        String string = "Hello Java World";
        String subString = "World";

        int result = string.indexOf(subString);
        if(result == -1){
            System.out.println(subString + "Not Present in the String");
        }else
        System.out.println(subString + " Is Present in the String");
    }
    
}
