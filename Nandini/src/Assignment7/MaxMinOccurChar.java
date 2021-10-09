package Assignment7;

public class MaxMinOccurChar {

    public static void main(String[] args) {
        
        String string = "JavaProgrammer";

        int[] count = new int[string.length()];
        

        char minChar = string.charAt(0);
        char maxChar = string.charAt(0);

        int i,j;

        char ch[] = string.toCharArray();

        //count each word in a given string and stores in array frequency
        for(i=0;i<ch.length;i++){

            count[i] = 1;
            for(j=i+1;j<ch.length;j++){
                if(ch[i] == ch[j] && ch[i]!=' ' && ch[i]!= '0')
                {
                    count[i]++;
                    ch[j] = '0';
                }
            }
        }

        int min,max;
        min = count[0];
        max = count[0];
        for(i=0;i<count.length;i++){

        //If min is greater than frequency of a character   
            //then, store frequency in min and corresponding character in minChar  
            if(min > count[i] && count[i] != '0') {  
                min = count[i];  
                minChar = ch[i];  
            }  
            //If max is less than frequency of a character   
            //then, store frequency in max and corresponding character in maxChar  
            if(max < count[i]) {  
                max = count[i];  
                maxChar = ch[i];  
            }  
        }

            System.out.println("Minumum Ocuuring Character " + minChar);
            System.out.println("Maximum Occuring Character " + maxChar);

    }
    
}
