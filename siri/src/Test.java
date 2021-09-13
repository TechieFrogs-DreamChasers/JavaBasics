import java.lang.ProcessBuilder.Redirect.Type;

class car{
    int size;
    Type model;
    void speed(){
         System.out.println("Having 1200kmh"); 
         
    }
    void size(){
        System.out.println("x valume of size");
    }
    public static void main(String[] args) {
        car oCar=new car();
        oCar.size();
        Test oTest=new Test();
        oTest.Print();
       // Test oTest1=new Test();
        oTest.name="siri";
        oTest.num=15;
      // oTest.lastname="yanala";//static Variables must have class name only
        Test.lastname="yanala";//class name is Text,oTest is object name
        System.out.println(Test.lastname+" "+oTest.num);
        Test oTest2=new Test();
        oTest2.name="murali";
        Test.lastname="gude";
        //System.out.println(oTest.name+" "+oTest.num+" " +oTest2.name);
       // System.out.println(Test.lastname+" "+oTest.num+" "+Test.lastname);//over riding the last name
        System.out.println(Test.lastname);

    }
}

public class Test {
    int num;
    String name;
    static String lastname;
    void Print(){
        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        int i=10;
        Test oTest=new Test();
     System.out.println(oTest.num+" "+oTest.name+" "+i);
     oTest.Print();
     car ocar= new car();
     ocar.size();


        
        
    }
    
}
