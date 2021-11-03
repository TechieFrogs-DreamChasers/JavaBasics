package PRACTICE.Arrays;

public class Qn {
    public static void main(String args[])
     {
         /*int arr[] = new int[] {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};
         int n = 6;
         n = arr[arr[n] / 2];
         System.out.println(arr[n] / 2);*/
         

        /*
         char array_variable [] = new char[10];
         for (int i = 0; i < 10; ++i)
         {
             array_variable[i] = 'i';
             System.out.print(array_variable[i] + "");
         }*/
         

        /*String chars[] = {"a", "b", "c", "a", "c"};
        for (int i = 0; i < chars.length; ++i)
        for (int j = i + 1; j < chars.length; ++j)
        if(chars[i].compareTo(chars[j]) == 0)
        System.out.print(chars[j]);*/

        String c = "Hello i love java";
        int start = 2;
        int end = 9;
        char s[]=new char[end-start];
        c.getChars(start,end,s,0);
        System.out.println(s);

        
    }
}
