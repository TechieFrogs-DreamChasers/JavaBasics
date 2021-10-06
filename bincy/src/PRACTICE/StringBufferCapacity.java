package PRACTICE;

public class StringBufferCapacity {
    public static void main(String[] args){
        StringBuffer str1 = new StringBuffer();
        System.out.println(str1+" "+str1.capacity());// returns the current capacity of the buffer--16
        str1.append("Welcome");
        System.out.println(str1+"  "+str1.capacity());//since string length is less than 16 -----16
        str1.insert(7,"Techie Frogs");
        System.out.println(str1+" "+str1.capacity());//now the string length is more than 16 ----(16*2)+2

        StringBuffer str2 = new StringBuffer("Good Morning");
        System.out.println(str2+" "+str2.length()+" "+str2.capacity());// capacity is 16+ string length

        StringBuffer str3 = new StringBuffer(20);//stringbuffer with capacity
        //System.out.println(str3.capacity());
        str3.append(str2);
        System.out.println(str3+" "+str3.capacity());
        str3.append(str2);
        System.out.println(str3.capacity());

        StringBuffer str4 =new StringBuffer(20);
        str4.ensureCapacity(30);//ensure minimum capacity,if the capacity is less than minimum 
                                //then new internal array is allocated with greater capacity.
        System.out.println(str4.capacity());
        str4.append("GoodBye all Have a nice");
        System.out.println(str4.length()+" "+ str4.capacity());
        System.out.println(str4.toString());
        System.out.println(str4.codePointAt(4));
        System.out.println(str4.codePointBefore(4));
        System.out.println(str4.compareTo(str3));

        
        

    }
}
