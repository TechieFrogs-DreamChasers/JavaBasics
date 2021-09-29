package PRACTICE;

public class StringBufferDemo {//mutable string
    public static void main(String[] args){
        StringBuffer str = new StringBuffer();//StringBuffer() with initial capacity 16
        System.out.println(str);
        str.append("GoodEvening guys so nice to see you");//no need to assign
        System.out.println(str+" "+str.capacity());//total length of string


        StringBuffer str1 = new StringBuffer("Have a nice evening");//StringBuffer with specified string
        
        System.out.println(str1+" "+str1.capacity());// 16+length of string
        str1.append(str);
        System.out.println(str1);

        StringBuffer str2 = new StringBuffer(20);
        str2.append("How are you doing!!!");
        System.out.println(str2);
        System.out.println( str2.capacity());

        StringBuffer  str3 = new StringBuffer(20);
        str3.append("How is your work!!!!!!!!!");
        System.out.println(str3+ " "+ str3.capacity());//length is greater than 20 then capacity= (20*2)+2

        str3.insert(7, "going");//inserts at specified position, must be greater than 0 and less than strlength.
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
