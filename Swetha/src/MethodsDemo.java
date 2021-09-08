public class MethodsDemo {
    int a,b;


public int display(int x,int y){
    System.out.println("My Method");
    System.out.println("Method 2nd line");
    a=x;
    b=y;
    //int c=a+b;
    return a+b;
}


public void display(){
    System.out.println("In Method");
}

public static void main(String[] args){
    MethodsDemo obj = new MethodsDemo();
    int d = obj.MethodsDemo(5,10);
    System.out.println("After Method");
    System.out.println(d);
    System.out.println("After 2nd Method");

}