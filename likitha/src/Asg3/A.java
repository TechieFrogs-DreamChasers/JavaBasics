package src.Asg3;

public class A {
   int i,j;
   public A(){
this.i=5;
this.j=10;
    }
    void show(){
        System.out.println(i+" "+j);
    }
}

class B extends A{
    int k;
    public B(){
        this.k=20;

    }
    void show()
    {
        System.out.println(k);
    }
    public static void main(String[] args) {
        B obj=new B();
        obj.show();
       // obj.show1();

    }
}