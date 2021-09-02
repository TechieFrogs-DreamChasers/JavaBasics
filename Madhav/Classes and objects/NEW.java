import java.util.*;

import Madhav.ans;
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
        System.out.println("Display method is "+this.n);
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




public class NEW {
    public static void main(String[] args) {

        ans tt = new ans();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    
        ans anss= new ans(a,b);
        System.out.println(anss.area());
        
    }
}
