package Assignment7;



public class CountTotal {

   /* public static void main(String[] args) {
        
        //StringBuffer string = new StringBuffer("Java Program");
        String str = "Java Basics";
        System.out.println(str.length());
    }*/

    public static void main(String[] args) {
        
        String str = "Java Program";
        int number  = 0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                number++;
            }
        }

        System.out.println("Total Characters in the String:  "+ number);
    }

    
    
}
