package Assignment7;

public class LongestRepeatingSequensce {

    public static void main(String[] args) {
        
        String givenString = "Beginning";
        
        String repeatString = "";
        
        int len = givenString.length();
        
        for (int i = 0; i < len; i++) {
            
            for (int j = i + 1; j < len; j++) {
               
                String sequence = countSequence(givenString.substring(i, len), givenString.substring(j, len));
                
                if (sequence.length() > repeatString.length())
                    
                    repeatString = sequence;
            }
        }
        //printing the repeat sequence
        System.out.println("Longest repeating sequence: " + repeatString);
    }
    

    public static String countSequence(String string, String longestrepeat) {
        int count = Math.min(string.length(), longestrepeat.length());
        for (int i = 0; i < count; i++) {
            if (string.charAt(i) != longestrepeat.charAt(i)) {
                return string.substring(0, i);
            }
        }
        return string.substring(0, count);
    }
    
}
