package PRACTICE;

public class InterfaceInheritance implements InterfaceC{
    public void simple(){
        System.out.println("Simple from InterfaceC");
    }
    public void sample(){
        System.out.println("Sample from InterfaceD");
    }
    public static void main(String[] args){
        InterfaceInheritance obj = new InterfaceInheritance();
        obj.simple();
        obj.sample();
        
    }
}
