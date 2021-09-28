package pack3;
import pack2.sub2;
import pack1.sub1;


public class sub3 extends sub2{

    sub1 method(sub3 s){

    
    sub1 s1 = s.method(s);
    return s1;
    }
    

    public static void main(String[] args) {

        sub3 s3 = new sub3();
        System.out.println(s3.method(s3));
        
    }

}