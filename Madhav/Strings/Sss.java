public class Sss {
    public static void main(String[] args) {
        String sss = "Hello dude, this is lakshmi madhav";
        
        char[] ch = sss.toCharArray();
        System.out.println(ch);
        for(int i = 0; i < ch.length; i++)
        {
            System.out.println(ch[i]);
        }
        
        for(char c = 'a'; c <= 'z' ;c++)
        {
            int sum=0;
            for(int i = 0 ; i < sss.length(); i++)
            {
                if(c == ch[i])
                {
                    sum = sum++;
                }

            }
            if(sum>0)
            {
                System.out.println("the count of letter "+c+" contains in the above sentence is "+sum);
            }
        }
        for(char c = 'A'; c <= 'Z' ;c++)
        {
            int sum=0;
            for(int i = 0 ; i <sss.length(); i++)
            {
                if(c == ch[i])
                {
                    sum = sum++;
                }

            }
            if(sum>0)
            {
                System.out.println("the count of letter "+c+" contains in the above sentence is "+sum);
            }
        }
    }
    
}
