public class Class1 { 
    int i;
    void printNum(int i){
        System.out.println(i);
    }
    
}
class subclass extends Class1{
    int j;
    void printNum(int j){
        System.out.println(j);
    }
    public static void main(String[] args) {
        subclass oSubclass =new subclass();
        oSubclass.printNum(10);
        Class1 oClass1 =new Class1();
        oClass1.printNum(20);

        
    }
        
    }

