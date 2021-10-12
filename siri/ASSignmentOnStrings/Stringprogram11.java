import java.util.Random;

public class Stringprogram11 {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numaric="123456789101112131415";
        //create an object of stringbuilder
        StringBuilder sb=new StringBuilder();
        //create an object to random
        Random random=new Random();
        //random string length
        int length =10;
        for(int i=0;i<=length;i++){
            int index=random.nextInt(alphabet.length());
            int index1=random.nextInt(numaric.length());
            // get character specified by index
          // from the string
          char randomChar = alphabet.charAt(index);
          char randomnum =numaric.charAt(index1);
    
          // append the character to string builder
          sb.append(randomChar);
          sb.append(randomnum);
        }
    
        String randomString = sb.toString();
        System.out.println("Random String is: " + randomString);
    
      }

  
    

        }




        
    
    

