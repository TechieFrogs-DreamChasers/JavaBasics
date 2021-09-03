import java.util.*;

class romanToNum
{
    int value(char letter)
    {
    switch (letter) {
             case 'I':  return 1;
             case 'V':  return 5;
             case 'X':  return 10;
             case 'L':  return 50;
             case 'C':  return 100;
             case 'D':  return 500;
             case 'M':  return 1000;
             default:   return -1;
          }
    }
    int romanToInt(String s)
    {
        int total=0;
        for(int i=0;i<s.length();i++)
        {
            int s1=value(s.charAt(i));
            if(i+1 < s.length())
            {
                int s2=value(s.charAt(i+1));
                if(s1 >= s2)
                {
                    total=total+s1;
                    
                }
                else
                {
                    total=total-s1;
                    
                }
            }
            else
            {
                total=total+s1;
            }
        }
        return total;
    }
          
 public static void main(String args[])
 {
     romanToNum ob = new romanToNum();
     Scanner sc = new Scanner(System.in);
     String val= sc.next();
     for(int i = 0 ;i < val.length() ; i++)
    {
        char ch = val.charAt(i);
        if(!(ch=='I'||ch=='V'||ch=='X'||ch=='L'||ch=='C'||ch=='D'||ch=='M'))
        {
            System.out.println("Try Again.Please enter correct roman number");
            val = sc.next();
            i= -1;
        } 
        
    } 
     System.out.println(ob.romanToInt(val));
 }
}