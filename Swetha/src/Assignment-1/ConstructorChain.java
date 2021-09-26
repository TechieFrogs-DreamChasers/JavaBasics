public class ConstructorChain {
    int rollno;
    static int j;
    String name;
    double d;
    ConstructorChain(){
        System.out.println("In Default");
    }
    ConstructorChain(int i){
        this();
        System.out.println("In Single Int Constructor");
    }
    ConstructorChain(String name){
        this(100);
        System.out.println("Single Parameter Concstructor");
    }
    ConstructorChain(int rollno,String name){
        System.out.println("In Two Parameter Concstructor");
    }
    void display(){
        System.out.println("In Display Method");
    }
    public static void main(String[] args) {
        ConstructorChain obj=new ConstructorChain(100);
        //obj.display();
        ConstructorChain obj1=new ConstructorChain("Swetha");
        //obj1.display();
        ConstructorChain obj2=new ConstructorChain(14,"Swetha");
       // obj2.display();

    }


}
