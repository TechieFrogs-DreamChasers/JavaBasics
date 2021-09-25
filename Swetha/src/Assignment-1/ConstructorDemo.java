public class ConstructorDemo {
    int i;
    static int j;
    String FullName;
    void display(){
        System.out.println("In display");
    }
    ConstructorDemo(){
        i=10;
        j=15;
        System.out.println("In Default constructor");
    }
    ConstructorDemo(int a){
        i=a;
        System.out.println("In Single Parameterised Constructor");
    }
    ConstructorDemo(int a ,int b){   //Parameterised Constructor.we can have any no of constructors.
        i=a;                     //It accepts untill there are no Duplicates
        j=b;
        System.out.println("In 2 Parameterised Constructor");
    }
    ConstructorDemo(int rollno,String name){
        FullName=name;
        i=rollno;
        j=15;
        System.out.println("In Student Details Constructor");
    }
    
    public static void main(String[] args) {
        ConstructorDemo myobj=new ConstructorDemo();
        myobj.display();

        ConstructorDemo mybj=new ConstructorDemo(10);
        mybj.display();
       // myobj.i=100;
        //ConstructorDemo.j=200;
        //System.out.println(myobj.i+" "+myobj.j);
        ConstructorDemo myobj1=new ConstructorDemo(108,"Swetha");   //as static variables(j) memory is allocated only once,
      //  myobj1.i=150;    //its fetches the latest Assigned value to avoid this abiguity,we need to acces  
        //ConstructorDemo.j=250;                //  static variables its class name

        //System.out.println("First Object values are "+ myobj.i +" " +ConstructorDemo.j );
        //System.out.println("Second object values are " + myobj1.i+" "+ConstructorDemo.j);

        
    }
}

    /*public class MyConstructor{
        int i;
        static int j;
        MyConstructor(){
            i=10;
            j=15;
            System.out.println("In Student Constructor");
        }
    }*/
    
