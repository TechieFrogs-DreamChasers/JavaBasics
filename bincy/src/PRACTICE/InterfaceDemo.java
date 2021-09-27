package PRACTICE;

public class InterfaceDemo extends AbstractA implements InterfaceA,InterfaceB {
    public void draw(){
        System.out.println("In draw");
        InterfaceB.super.delete();
    }
    void myDisplay(){
        System.out.println("In display");
        InterfaceB.super.delete();
    }
    public  int move(){
        System.out.println("In InterfaceDemo class");
        return 45;
    }
    @Override
    public void delete(){
        System.out.println("Overriding default delete in InterfaceB");
        //InterfaceB.super.delete();
    }

    public void drag(){
        System.out.println("In drag");
    }
    public static void main(String[] args){
       InterfaceDemo intDemo = new InterfaceDemo();
       /*intDemo.move();
       intDemo.myDisplay();
       System.out.println(InterfaceDemo.i+" "+intDemo.k);
       //InterfaceDemo.i =34;
       intDemo.drag();
       intDemo.draw();
       intDemo.myDisplay();
       intDemo.delete();
       Inner inner =new Inner();
       inner.innerDisplay();
       System.out.println(inner.a+" "+inner.b);*/
       InterfaceB.display();
        intDemo.myDisplay1();
       
    }
}
    
    

