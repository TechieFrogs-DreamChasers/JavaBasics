class ans{
    int v;
    //int n=5;
    int area()
    {
        
        return v;
    }
    /*void display()
    {
        int n =100;
        System.out.println("Display method"+this.n);
    } */

    ans()
    {
        System.out.println("Ex constructor");
        
    }
    ans(int a,int b)
    {
        v = a*b;
        area();
    }
}




public class Rectangle {
    public static void main(String[] args) {

        ans tt = new ans();
        ans b= new ans(3,4);
        System.out.println(b.area());
        
    }
}
