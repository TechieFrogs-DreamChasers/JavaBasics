package Practice.InterviewPractice;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class FrequencyString {
    public static void main(String[] args) {
        
        String stringValue;

        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Enter String: ");
        stringValue = Validation.validateString(keyBoard);

        int i,j;
        int visited = -1;

        System.out.println("Original String: "+ stringValue);

        char[] ch = stringValue.toCharArray();
        int[] chr = new int[stringValue.length()];

        System.out.print(ch);

        for(i=0;i<ch.length;i++){
            int count = 0;
            for(j=0;j<ch.length;j++){

                if(ch[i]==ch[j]){
                    count++;
                    chr[j] = visited;
                }
                
                if(chr[j]!=visited){
                    chr[i]=count;
                }
            }

            System.out.println();
        }

        System.out.println("Frequency of Letters: ");
        for(i=0;i<stringValue.length();i++){
            if(chr[i]!=visited && ch[i]!=' ')
            System.out.println(ch[i]+" Frequency is "+ chr[i]);
        }    
    }
}
