package PRACTICE;

public class StringBufferDemo {//mutable string
    public static void main(String[] args){
        StringBuffer str = new StringBuffer();//StringBuffer() with initial capacity 16
        System.out.println(str+" "+str.capacity()+","+str.length());//" " 16,0
        str.append("GoodEvening");//no need to assign
        System.out.println(str+": "+str.capacity()+","+str.length());//total length of string
        System.out.println("----------------------------------");

        StringBuffer str1 = new StringBuffer("Have a nice evening");//StringBuffer with specified string
        System.out.println(str1+" "+str1.capacity()+" ,"+str1.length());// 16+length of string
        str1.append(str);//appending stringbuffer object
        System.out.println(str1);
        str1.append(" guy");//appending string
        System.out.println(str1);
        str1.append('s');//appending character
        System.out.println(str1);
        str1.append(10);//appending int
        System.out.println(str1);
        char ch[] =new char[]{',','a','b','c','d','e','f','g','h','i','j',','};
        str1.append(ch);//appending charactersequence
        System.out.println(str1);
        str1.append(ch,3,7);//appending character sequence,start,count 
        System.out.println(str1);
        str1.append(true);//appending boolean
        System.out.println(str1);
        str1.appendCodePoint(70);//F
        System.out.println(str1);
        System.out.println("------------------------------");

        StringBuffer str2 = new StringBuffer(20);
        System.out.println(str2.capacity()+","+str2.length());
        str2.append("How are you doing Dream Chasers!!!");
        System.out.println(str2);
        System.out.println( str2.capacity()+","+str2.length());

        StringBuffer  str3 = new StringBuffer(20);
        str3.append("How is your work!!!!!!!!!");
        System.out.println(str3+ " "+ str3.capacity());
        //if length is greater than 20 then capacity= (20*2)+2
        System.out.println("insert()------------------------");
        
        str3.insert(7, "going");
        //inserts at specified position, must be greater than 0 and less than strlength.
        str1.insert(3, ch, 4, 2);
        System.out.println(str1);
        StringBuffer str4 = new StringBuffer();

        //str4.insert(4,"Welcome");
        System.out.println(str4+" "+str4.capacity());
        
        System.out.println(str3);

        str3.replace(1,1,"doing");//replace(start index,end index,string), start and end same means
        System.out.println(str3);     //replaced without losing any characters like insert
        str3.replace(1,6,"");//replaced with null string
        

       System.out.println(str3);
       str3.reverse();
       System.out.println(str3);
       str3.reverse();

       str3.delete(2,4);
       System.out.println(str3);

       str3.deleteCharAt(2);
       System.out.println(str3);



    }
}
