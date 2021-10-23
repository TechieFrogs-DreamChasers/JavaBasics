package PRACTICE.Exception;

import java.io.IOException;
import java.sql.SQLException;

//chaining
public class Chaining {
    void method1(){
        method2();
    }
    void method2(){
        method3();
    }
    void method3(){
        method4();
    }
    void method4(){
        throw new SQLException() ie;
    }
    
    public static void main(String[] args){
        method1();
        System.out.println("End");
    }
}
