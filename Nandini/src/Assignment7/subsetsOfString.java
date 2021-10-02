package Assignment7;

import java.util.Scanner;

public class subsetsOfString {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        sc.close();

        System.out.println("The entered string are "+string);
        System.out.println("All the substrings of the above string is: ");

        //Call to find the all the subsets of the string
        subString(string, string.length());

    }

    static void subString(String string, int num)
   {
        for (int i = 0; i < num; i++)      
        {
           for (int j = i+1; j <= num; j++)    
            {
                System.out.println(string.substring(i, j));
            }
        }
    }
    
}


/*System.out.println("Enter the String ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        sc.close();

        int length = string.length();

        int numOfSubsets = (length*(length+1))/2;

        String[] subStrings = new String[numOfSubsets];

        int k = 0;

        for(int i=0; i<length; i++){
            for(int j=1; j<=length; j++){

            String subset = string.substring(i, j);
            subStrings[k] = subset;
            k++;
        }
        
        }  
        
        for(int a=0;a<subStrings.length;a++){

            System.out.println("The Subsets of the string is: "+ subStrings[a]);
        }*/
