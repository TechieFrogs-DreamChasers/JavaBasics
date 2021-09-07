class A
{
    int i,j;
    a()
    {
        i = 3;
        j=4;
    }
    void show()
    {
        System.out.println("i = "+i+" j = "+j);
    }
}
public class B {
    int k;
    B()
    {
        k =5;
    }
    void show()
    {
        System.out.println("k = "+k);
    }
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }

    
}
