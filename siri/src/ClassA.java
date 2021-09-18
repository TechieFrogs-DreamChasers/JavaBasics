public class ClassA{ 
static void print(){
    System.out.println("parent");
}    
}
class ClassB{
    static void print(){
        System.out.println("child");
    }
    public static void main(String[] args) {
        print();// not creating object because method is also static
        ClassA.print();  //out of the class also not extended bcoz its static given like this
        
    }
}

