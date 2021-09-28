package Practice.StringPractice;

public class StringBufferConstructors {

    public static void main(String[] args) {
        
        StringBuffer str = new StringBuffer();
        System.out.println(str.capacity());
        //str.append("This is java class");
        System.out.println(str);

        StringBuffer str1 = new StringBuffer("Hello JavaBasics");
        System.out.println(str1);

        StringBuffer str2 = new StringBuffer(10);
        System.out.println(str2.capacity());
    }
    
}
