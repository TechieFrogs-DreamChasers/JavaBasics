package Assignment7;

public class CountPanctuation {

    public static void main(String[] args) {
        
        int countPuncMarks = 0;

        String str = "Java World! Programmig!! done with all Programming?";  

        for (int i = 0; i < str.length(); i++) {  
                //Checks whether given character is punctuation mark  
            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '-' ||  
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') {  
                countPuncMarks++;  
            }  
        } 
        System.out.println("   "); 
        System.out.println("Total number of punctuation characters exists in string: " + countPuncMarks);
         
    }
    
}
