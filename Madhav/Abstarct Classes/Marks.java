public abstract class Marks {

    abstract int getPercentage();

    public static void main(String[] args) {
        A a = new A(56, 78, 69);
        B b = new B(36, 77, 69, 81);
        System.out.println("Student A Percentage is "+a.getPercentage());
        System.out.println("Student B Percentage is "+b.getPercentage());
    }
    
}
class A extends Marks{
    int p;
    A(int a,int b, int c)
    {
        this.p = (a+b+c) / 3;
    }
    int getPercentage()
    {
        
        return this.p;
    }

}
class B extends Marks{
    int p;
    B(int a,int b, int c,int d)
    {
        this.p = (a+b+c+d) / 4;
    }
    int getPercentage()
    {
        
        return this.p;
    }

}
