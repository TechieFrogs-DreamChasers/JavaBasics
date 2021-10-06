class Test1{

    String size;
    String model;
    int value;
    String color;
    static String c = "Fifth";
    
    void speed(){
        System.out.println("Speed for this model is 60kmph");
    }

    void distance(){
        System.out.println("distance is 30kmpl");
        
    }

}

class Student {

    int id;
    String name;
    int age;
    

    public static void main(String[] args) {
        System.out.println("Has to go student");

        Test1 obj1 = new Test1();
        obj1.model = "corolla";
        obj1.value = 200000;
        Test1.c = "Sixth";
        System.out.println(obj1.model+" "+obj1.color+" "+obj1.value+" "+Test1.c);


        Connectors2 obj3 = new Connectors2(200,300);
        System.out.println(obj3.a+  "  connectors2  "+  obj3.f);

        obj3.test();
        Connectors2 obj4 = new Connectors2();
        





        Type obj2 = new Type();
        obj2.m = "Tested";
        obj2.display();
        System.out.println(obj2.m);

        
        

    }
    
}
public class Connectors {

    int i;
    String s = "Hello";
    int j;

    public static void main(String[] args) {
        Connectors num = new Connectors();
        num.i = 10;
        System.out.println(num.i+"   "+num.s);
        

    }
    
}


