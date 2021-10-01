package Assignment7;

public class SubstringContainsMethod {
    public static void main(String[] args) {
  
    String str = "Hello Java Team";
    String subString = "Team";
    
    boolean result = str.contains(subString);
    if(result){
        System.out.println(subString + " Is Present in the String");
    }else
    System.out.println(subString + "Is not in the String");

    } 
}
