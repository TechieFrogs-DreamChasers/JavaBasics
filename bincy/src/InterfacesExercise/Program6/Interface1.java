package InterfacesExercise.Program6;

interface Interface1 {
    default void method11(){
        System.out.println("Method11");
    }
    default void method12(){
        System.out.println("Method12");
    }
}

interface Interface2{
    default void method21(){
        System.out.println("Method21");
    }
    default void method22(){
        System.out.println("Method22");
    }
    
}
interface Interface3{
    default void method31(){
        System.out.println("Method31");
    }
}
interface NewInterface extends Interface1,Interface2,Interface3{
    void newMethod();

}
class MyClass{
    void show(){
        System.out.println("In Myclass show");
    }
}

class NewClass extends MyClass implements NewInterface{
    public void newMethod(){
        System.out.println("In newMethod");
    }
    void show(Interface1 i1){
        System.out.println("In show");
    }
    void tell(Interface2 i2){
        System.out.println("In tell");
    }
    void write(Interface3 i3){
        System.out.println("In write");
    }
    void delete(NewInterface newi){
        System.out.println("In delete");
    }

    public static void main(String args[]){
        NewClass newobj = new NewClass();
        newobj.delete(newobj);
        newobj.write(newobj);
        newobj.method11();
    }
}

