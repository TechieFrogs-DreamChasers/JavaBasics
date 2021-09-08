package PRACTICE;
class Demo1{
    int length;
    int breadth;
    
    void areaofrec(){
        System.out.println("Length multiplied by breadth");
    }

}
public class ClassDemo {
    int a;
    int b;
    public static void main(String[] args){
        int i=5;
        ClassDemo demo=new ClassDemo();
        System.out.println(demo.a+" "+demo.b+ " "+i);
        Demo1 demo1=new Demo1() ;
        demo1.areaofrec();
    
    }
    
}
