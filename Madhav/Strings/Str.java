import java.util.Locale;

public class Str{
    public static void main(String[] args) {

        int a = 10;
        Double d = 20.0;
        float f = 3f;
        String str1 = "Maddy";
        String str2 = "LuckyDude.i";
        String str3 = "maddy";
        String str4 = "  Lucky";
        String s1= " ";


        System.out.println(str1.length()+ " and "+str2.length());
        System.out.println(str1.compareTo(str3));
        str1 = str1.concat(" "+str4);
        System.out.println(str1);
        System.out.println(s1.isEmpty()+" "+str1.isEmpty());
        System.out.println(s1.isBlank());
        System.out.println(str4);
        System.out.println(str4.trim());
        System.out.println(str2.toLowerCase());
        System.out.println(str2.toUpperCase());

        String s2 = String.valueOf(f);
        System.out.println(s2+str2);

        String s3 = s1.replace('M','t');
        System.out.println(s3);
        System.out.println(str2.replace("Lucky","Maddy"));
        Boolean s = str2.contains("Lucky");
        System.out.println(s);
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        //-------------------------------------------------------------------------
        StringBuffer sb = new StringBuffer("Hello Madhav");
        System.out.println(sb.delete(6,9));
        System.out.println(sb.deleteCharAt(6));
        System.out.println(sb);
        System.out.println(sb.append(" hhhh"));
        System.out.println(sb.insert(4, "madhav"));
        System.out.println(sb.replace(4, 8,"kkkk"));
        

        

        String ss = "azAZ";
        byte[] b =ss.getBytes();
        for(int i = 0; i < ss.length();i++)
        {
            System.out.println(b[i]);
        }
        //------------------------------------------------------------------------------------------
        String sss = "Hello dude, this is lakshmi madhav";
        
        char[] ch = sss.toCharArray();
        System.out.println(ch);
        
        for(char c = 'a'; c <= 'z' ;c++)
        {
            int sum=0;
            for(int i = 0 ; i < ch.length; i++)
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
            for(int i = 0 ; i < ch.length; i++)
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