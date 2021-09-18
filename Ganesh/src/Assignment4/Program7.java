package Assignment4;

public class Program7 {
    int i;
    void printNum(){
        System.out.println("Value of i :"+i);
    }
}
class subclass extends Program7{
    int j;
    void printNum(){
        System.out.println("Value of j :"+j);
    }
    public static void main(String[] args){
        subclass me = new subclass();
        me.i = 15;
        me.j = 25;
        me.printNum();
    }
}
