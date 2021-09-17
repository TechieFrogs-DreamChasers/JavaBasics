package Abstractmethod;
abstract class M{
    M(){
        int i,j;
        i=10;
        j=20;
        System.out.println((i+j));  
    }
    
    
    abstract void display();
    
} 
class N extends M{
    
    void display(){
        System.out.println("abstract method");
    }
}

public class Cntstr {
    public static void main(String[]args){
        N ob = new N();
        ob.display();

    }
    
}
