package PRACTICE;

public class Initialization {
    Initialization(){
        print();
    }

    void print(){
        System.out.println("Inside print InterfaceDemo");
    }
}

class B extends Initialization{
    static int i=10;
    static int j;
    static{
        System.out.println(i);
        j=20;
        System.out.println("In static block");
    }
     
    int k= 20;
    {
        System.out.println("In Instance block");
        int m=45;
        System.out.println(m);
        j=50;
    }

    B(){
        System.out.println("In constructor B");
    }
     public static void main(String[] args){
        System.out.println("In main");
        B b = new B();
        System.out.println(b.k+" "+B.i+ " "+B.j+" ");
        b.print();
     }
}

