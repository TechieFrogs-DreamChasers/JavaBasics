package TestPack;

abstract class Abstract {

    abstract void display();

    void message(){
        System.out.println("In the message method");
    }

    static void method(){
        System.out.println("In the static");
    }
public static void main(String[] args) {
   // Abstract x1 = new Abstract();
   System.out.println("In the main method");
}

abstract class Nested{

    int i = 10;
    int j = 20;
    int z = (i+j);


   public int integer(){
       return z;
   }

   void nested(){
       System.out.println("In the nested");
   }

   //abstract void hi();
}
    
}

class Abstractdemo extends Abstract{

    @Override
    void display() {
        System.out.println("In the extended display");// TODO Auto-generated method stub
        
    }

    public static void main(String[] args) {
        Abstractdemo x1 = new Abstractdemo();
        x1.display();
        Abstractdemo.method();
        x1.message();
    }


    
}




