package Abstractmethod;
abstract class M{
    int i;
    int j;
    
    abstract void display();
    
} 
class N extends M{
    int i;
    int j;
    N(){
        i=10;
        j=20;
        System.out.println((i+j));  
    }
    void display(){
        System.out.println("abstract method");
    }
}

public class Cntstr {
    public static void main(String[]args){
        C ob = new C();
        ob.display();

    }
    
}
