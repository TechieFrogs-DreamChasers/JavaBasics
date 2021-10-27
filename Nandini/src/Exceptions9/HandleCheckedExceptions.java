package Exceptions9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HandleCheckedExceptions {
    public static void main(String[] args) throws IOException{
        
        try {
            FileReader fileReader = new FileReader("C:\\abc.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            for(int i=0;i<1;i++){
                System.out.println(bufferedReader.readLine());
                bufferedReader.close();
            }
           
        } catch (FileNotFoundException e) {
            
            System.out.println("File Not Found Exception:  "+e.getMessage());
        }
        try {
            String s = "";
            String s1 = "";
            if(s.length() == 0 || s1.length() == 0){
                throw new Exception("length should be more than 0");
            }
            //System.out.println(s.compareTo(s1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //System.out.println(e.getClass());
        }
        
    }

    
}
