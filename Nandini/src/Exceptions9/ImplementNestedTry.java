package Exceptions9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;

public class ImplementNestedTry {
    public static void main(String[] args) throws IOException {
        
        try{

            try{
                int[] i = {2,56,43,1};
                System.out.println(i[20]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }

            try {
                FileReader fileReader = new FileReader("C:\\abcd.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
    
                for(int i=0;i<1;i++){
                    System.out.println(bufferedReader.readLine());
                    bufferedReader.close();
                }   
            }catch(FileNotFoundException e){
                System.out.println(e.getMessage());
            }


        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
