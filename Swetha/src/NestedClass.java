public class NestedClass {
    int i;
    private String name;
    static int y=100;
    void display(){
        System.out.println("In outer Display");
        InnerClass inobj=new InnerClass();//Accessing Inner class member i.e. innerDisplay  method by creating InnerClass object here
        inobj.innerDisplay(); 
    }
    NestedClass(){
        System.out.println("In outer class constructor");
    }
       

    class InnerClass{
        int k;
        static int j=0;
        void innerDisplay(){
            System.out.println("In Inner Display"+name+y+j);
            //display();
        }
        InnerClass(){
            System.out.println("In InnerClass Constructor");
        }
        class NestedInnerClass{
            void hello(){
                System.out.println("In Hello"+k+i);
            }
        }
        
        public static void main(String[] args) {
           // InnerClass inner=new InnerClass();
            
        }
    }
    public static void main(String[] args) {
        NestedClass outobj=new NestedClass();//creating object for outer class
        outobj.display();
       // InnerClass inobj=outobj.new InnerClass();
        //NestedClass.InnerClass inobj=outobj.new InnerClass();//creating object for InnerClass
        //inobj.innerDisplay();
        //NestedInnerClass nesobj=inobj.new  NestedInnerClass();
        //NestedClass.InnerClass.NestedInnerClass nesobj=inobj.new NestedInnerClass();//creating object for NestedInnerClass 
        //nesobj.hello();

    }
    
}
