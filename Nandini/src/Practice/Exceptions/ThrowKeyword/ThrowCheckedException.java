package Practice.Exceptions.ThrowKeyword;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowCheckedException {
    public static void main(String[] args) {
        
        //Every subclass of Error and RuntimeException is an unchecked exception in Java. 
        //A checked exception is everything else under the Throwable class.

        try{
            fileMethod();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("Code ");

    }

        public static void fileMethod() throws FileNotFoundException {

            FileReader file = new FileReader("C:\\Desktop\\file.text");
            BufferedReader fileInput = new BufferedReader(file);

            throw new FileNotFoundException();

    }
    
}
