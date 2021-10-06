package AbstractClassAssignmt;

public abstract class  AbstractDemo {
    AbstractDemo(){
        System.out.println("This is constructor of Abstract class");
    }

    public abstract void  a_method();
    public void display(){
        System.out.println("This is a non abstract method");
    }
}

class SubClass extends AbstractDemo{
    public void a_method(){
        System.out.println("This is an abstract method");
    }
    public static void main(String[] args){
        SubClass sub = new SubClass();
        sub.a_method();
        sub.display();
    }
}

