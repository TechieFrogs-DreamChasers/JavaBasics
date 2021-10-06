package PRACTICE;
/*Inner class can access all the variables and methods of outer class
  Outer class cannot access inner class methods and variables 
  Using outer object we can access outer members except the innerclass (it is also a member)
  using inner we can access inner members, we cannot access outer members 
  since it is accessable without object.
  We can create objects of innerclass in the methods of outerclass and can access
  all members.
  To access the innerclass we need outer class object.



*/

public class NestedClass {
    int i=5;
    static int j=6;
    private int k=7;

    void display(){
        System.out.println("In Outer class");
        System.out.println(i+ " "+j+" "+k);
        InnerClass inner = new InnerClass();  //Inner class object in outer class method
        System.out.println(inner.a +" "+ InnerClass.b +" "+ inner.c);// Inner class variables
    }

    class InnerClass{
        int a=8;
        static int b;
        private int c= 10;

        void innerDisplay(){
            System.out.println("In inner class");
                       
            System.out.println(i+" "+ k+" "+j+" outer class");// Outer class variables
            System.out.println(a+ " "+ b +" "+c+" Inner class");// Inner class variables
            display();   //Outer class method

        }
        InnerClass(){
            System.out.println("Constructor InnerClass");
        }

        InnerClass(int l, int m){
            this();
            System.out.println("Parameterised InnerClass constructor");
        }
        static void staticInDisplay(){
            System.out.println("In static display");
        }

        class DeepInner{
            void displayDeepInner(){
                System.out.println("Inside displayDeepInner");
            }
        }

        public static void main(String[] args){
            System.out.println("In inner main()");

        }
        

    }
    public static void main(String args[]){
        NestedClass outer = new NestedClass();
        outer.display();
        
        NestedClass.InnerClass inner = outer.new InnerClass();
        inner.innerDisplay();
        InnerClass.staticInDisplay();

        InnerClass.DeepInner deepInner = inner.new DeepInner();
        deepInner.displayDeepInner();
    }
}
