package polymorphism;
class childs extends Parents{
    static void display(){
        System.out.println("Child");
    }
}

public class Parents {
    static void display(){
        System.out.println("parent");
    }
    public static void main (String[]args){
        Parents a = new Parents();
        a.display();
        Parents.display();//static way to access
        childs b = new childs();
        b.display();
        Parents obj = new childs();
        obj.display();

    }
}
