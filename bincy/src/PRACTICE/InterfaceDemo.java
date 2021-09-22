package PRACTICE;

public class InterfaceDemo extends AbstractA implements InterfaceA,InterfaceB {
    public void draw(){
        System.out.println("In draw");
    }
    void myDisplay(){
        System.out.println("In display");
    }
    public  int move(){
        System.out.println("In InterfaceDemo class");
        return 45;
    }
    public void delete(){
        System.out.println("Overriding default");
        InterfaceB.super.delete();
    }

    public void drag(){
        System.out.println("In drag");
    }
    public static void main(String[] args){
       InterfaceDemo intDemo = new InterfaceDemo();
       intDemo.move();
       intDemo.myDisplay();
       System.out.println(InterfaceDemo.i+" "+intDemo.k);
       //InterfaceDemo.i =34;
       intDemo.drag();
       intDemo.delete();
    }
}
    
    

