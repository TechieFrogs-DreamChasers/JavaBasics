package Exceptions9;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class PassArguementsThrowing {
    public static void main(String[] args) throws IOException {
        
        try {
            FileReader fileReader = new FileReader("C:\\abc.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            for(int i=0;i<1;i++){
                System.out.println(bufferedReader.readLine());
                bufferedReader.close();
            }

        } catch (IOException e) {
            System.out.println("Message: " + e.getMessage());
        }
    }
    
}

/*
Output:

if it is exists it prints the first line of the file.
Hi

If it is not exist file 
Message: C:\abc.txt (The system cannot find the file specified)

*/