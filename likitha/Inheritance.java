public class Inheritance {
void display()
{
    System.out.println("this is parent class");
    //System.out.println();
}
public static void main(String[] args) {
    Inheritance i=new Inheritance();
    In i2=new In();   
    i.display();
    i2.display1();
    i2.display();

   }
   
}
     class In extends Inheritance{
        void display1()
        {

        
        System.out.println("this is child class");
        }
      

    }
    

