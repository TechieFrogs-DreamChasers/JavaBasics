package nestedclasspractice;

class Sup {
    int x;
    int y;
    void getxy(){
        x=100;
        y=20;
    }
    }
class Sub1 extends Sup{
    void add(){
        System.out.println("Addition = "+(x+y));
    }
}
class Sub2 extends Sup{
    void mul(){
System.out.println("Multiplication ="+ (x*y));
    }
}
class Sub3 extends Sup{
    void substraction(){
        System.out.println("Substraction ="+ (x-y));
    }
}
 class Hierarchial{
public static void main(String[]args){
    Sub1 obj1 = new Sub1();
    Sub2 obj2 = new Sub2();
    Sub3 obj3 = new Sub3();
    obj1.getxy();
    obj2.getxy();
    obj3.getxy();
    obj1.add();
    obj2.mul();
    obj3.substraction();
    
}
 }