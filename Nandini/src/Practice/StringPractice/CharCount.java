package Practice.StringPractice;

import java.util.Arrays;

public class CharCount {
   
    /*static int i,c=0,res;
    
    static int charcount(String s)
    {
        for(i=0,c=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            c++;
        }
        return c;
    }
    
    public static void main (String args[])
    {
        res=CharCount.charcount(" manchester united is also known as red devil ");
        //string is always passed in double quotes
        
        System.out.println("The number of characters in the String are :  "+res);
    }*/


  
	public static void main(String[] args) 
	{
		//String s = "1".repeat(5);
		
		//System.out.println(s);


       // System.out.println("1".concat("2").repeat(5));


       /*String string = "string".replace('i', '0');
		
		System.out.println(string.substring(2, 5));*/

       /* String str = "	Java\tConcept\tOf\tThe\tDay		".strip();
		
		System.out.println(str);*/


        /*String str1 = "Java";
		
		String str2 = str1.intern();
		
		System.out.println(str1 == str2);*/



        /*String s1 = "ONE";
		
		s1.concat("TWO");
		
		s1 = s1.concat("THREE");
		
		System.out.println(s1);*/


        //System.out.println("JAVAJ2EE".substring(2, 5).substring(1).charAt(1));



        /*System.out.print("0".indent(0));
		System.out.print("1".indent(1));
		System.out.print("2".indent(2));
		System.out.print("3".indent(3));
		System.out.print("4".indent(4));
		System.out.print("5".indent(5));*/


        /*String string = "JAVA";

        String string2 = new String(string);
		
		StringBuffer sbuffer = new StringBuffer(string);
		
		StringBuilder sBuilder = new StringBuilder(string);
		
		System.out.println(string.equals(sbuffer));
		
		System.out.println(string.equals(sBuilder));
		
		System.out.println(sbuffer.equals(sBuilder));

        System.out.println(sbuffer.equals(sBuilder));

        System.out.println(string.equals(string2));

        System.out.println(string);
        System.out.println(sbuffer);
        System.out.println(sBuilder);
        System.out.println(string2);*/



/*
        Yes, java.lang.String class has static methods. They are,
1) copyValueOf()
2) format()
3) join()
4) valueOf()
All these methods are overloaded. */


        /*String str1 = "Java J2EE Spring Hibenate SQL";
		
		String str2 = "Python Java Scala C C++";
		
		System.out.println(str1.contains("HTML") == str2.contains("HTML"));*/


        /*String str1 = "OnE tWo ThReE fOuR";
		
		String str2 = "oNeTwOtHrEeFoUr";
		
		System.out.println(str1.trim().equalsIgnoreCase(str2));

        System.out.println(str1.trim());
        System.out.println(str2);*/


        /*StringBuffer sb = new StringBuffer("One Two Three Four Five");
		
		System.out.println(sb.reverse().indexOf("Two"));*/



        /*String s1 = "Sharma is a good player";  
        String s2 = new String("Sharma is a good player"); 
        String s3 = new String("Sharma is a good player"); //if the text is different it showa false.
        String s4 = "Sharma is a good player";
        //s2 = s2.intern(); 
        s3 = s3.intern(); 
        System.out.println(s1 == s4);*/
        
        

       /* String s = "Sharma is a good player and he is so punctual";  
        String words[] = s.split(" ");  
        System.out.println("The Number of words present in the string are : "+words.length); 
        for(String s1:words){
            System.out.println(s1);
        }
        System.out.println(Arrays.toString(words));*/


       /* double a = 29.89;
        byte b = (byte)a;
        System.out.println(b);*/

        /*String st = "Hello";
        boolean v;
        v = st.startsWith("hello");

        String s2 = new String(st);
        System.out.println(v);*/
        /*try{
            System.out.println("Hello"+""+1/0);
        }finally{
            System.out.println("hh");
        }*/

        /*int a = args.length;
        System.out.println(a);*/

        /*String [][]a=new String[2][2];
        int x;
        a[0]=args;
        x=a[0].length;
        for(int y=0;y<x;y++)
        System.out.println(" "+ a[0][y]);*/

        
	}

}
    

