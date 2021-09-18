package Assignment3;

public class A {
    int i = 458;
    static double j = 152.632;
    A(){
    
       System.out.println("This is Class A Constructor"); 
    }
    void show(){
        System.out.println("This is Class A show() Method"+i+"  "+j);
    }
}
class B extends A{
    int k = 1122;
    B(){
        System.out.println("This is Class B Constructor");
    }
    void show(){
        System.out.println("This is Class B show() method \nOverriding the show method in class A  :"+k);
    }
    public static void main(String[] args){
        B obj = new B();
        obj.show();
    }
}