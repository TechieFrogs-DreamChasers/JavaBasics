public class Strings {
    public static void main(String[] args) {
    //Interned way or String Literals stored in String Pool
    //str1 and str2 are reference variables pointing to the same literals 
        String str1="Hello";
        String str2="Hello";
    //Here we are not comparing the content i.e.Hello
    //Here we are comparing the hashcodes in str1 and str2
    //which will be same for the String Hello.
    if(str1==str2){
        System.out.println("str1==str2");
    }else{
        System.out.println("str1!=str2");
    }
    //String object i.e we used new Operator
    //String Object is constructed in heap area with Hello as its content
    String str3=new String("Hello");
    String str4=new String("Hello");
    //str3 and str4 are reference variables pointing to 2 different objectswhose content is same
    if(str3==str4){
        System.out.println("str3==str4");
    }else{
        System.out.println("str31=str4");
    }
    //Conclusion:== will compare reference variablesi.e hashcodes.not the real content
    //How should we compare strings i.e. the content with in
    if(str3.equals(str4)){
        System.out.println("str3 is equals to str4");       
    }else{
        System.out.println("str3 is not equal to str4");
    }
    if (str3.compareTo(str4)==0){
        System.out.println("str3 is compared to str4");
    }else{
        System.out.println("str3 is not compared to str4");
    }
    //String Methods
    }
    
}
