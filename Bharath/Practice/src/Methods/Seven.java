package Methods;

public class Seven {

    int i;

    void printNum(){
        System.out.println(i);
    }
  
}


class SubClass1 extends Seven{
    int j;

    void printNum(){
        System.out.println(j);
    }
    public static void main(String[] args) {
        
        SubClass1 x1 = new SubClass1();
        x1.i = 10;
        x1.j = 20;
        x1.printNum();
        
    }
}