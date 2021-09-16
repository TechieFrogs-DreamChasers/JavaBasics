package Assignment3;

public class Inheritance {
    class ParentClass{
        void display(){
            System.out.println("This is parent Class");
        }
       
        class ChildClass extends ParentClass{
            void display(){
                System.out.println("This is child class");
            }
        }

    }
    public static void main(String[] args){
       //ParentClass Obj1 = new ParentClass();
      // Obj1.display();


    }
}
