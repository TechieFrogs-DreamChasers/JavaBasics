/*1
*/
package AbstractClassAssignmt;

public abstract class Parent {
    void message(){

    }
}
class Subclass1 extends Parent{
    void message(){
        System.out.println("This is first subclass");
    }
}
class Subclass2 extends Parent{
    void message(){
        System.out.println("This is second subclass");
    }
}
class Demo{
    public static void main(String[] args ){
        Subclass1 sub1 = new Subclass1();
        Subclass2 sub2 =new Subclass2();
        sub1.message();
        sub2.message();
    }
}
