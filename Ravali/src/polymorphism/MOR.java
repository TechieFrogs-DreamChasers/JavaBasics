package polymorphism;


    class parent{
        void display(){
            System.out.println("parent");
        }
    }
    class child extends parent{
    
        void display(){
super.display();
  System.out.println("child");
        }    
    
public class MOR{
    public static void main (String []args){
        child ob = new child();
        ob.display();
    }
    }
}


    

