package PRACTICE;

public class LocalClass {
    int i;
    static int j;
    private String name;

    void display(){
        //static int a1; // we cannot declare static here because it belongs to entire class, not one of its
        System.out.println("Inside Localclass display");//methods
        System.out.println(i+ " "+ j+ " "+name);

        class InnerLocalClass{
            int a;
            static int b;
            private int c;

            void innerLocalDisplay(){
                System.out.println(a+ ""+b+ " "+c);
                System.out.println(i+" "+j+" "+name);
                
            }
            InnerLocalClass(){
                System.out.println("Inside InnerLocalClass constructor");
            }

        }

        InnerLocalClass inner = new InnerLocalClass();
        inner.innerLocalDisplay();

        class InnerClass{
            int i1;
            static int j1;
            
            static void displyInnerClass(){
                System.out.println(j+ " "+j1);

            }
        }

     
    }
    static class StaticInnerClass{

    }

    public static void main(String[] args){
        LocalClass outer = new LocalClass();
        outer.display();

    }
    
}
