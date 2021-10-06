package Assignment7;

public class Palindrome {

    public static void main(String[] args) {
        
        String string = "Kayak";

        boolean check = true;
        string = string.toLowerCase();

        //To check up to the middle of the string
        for(int i=0;i<string.length()/2;i++){

            if(string.charAt(i) != string.charAt(string.length()-i-1)){ //comaparing first and last characters same or not and nextlevel 
                check = false;
                System.out.println(" String is Not Palindrome ");
                break;
            }
        }
            if(check){
                System.out.println(" String is Palindrome ");
            
        }

    }
    
}
