package TestPack;

public class Encapsulation {

    private int i = 1;
    private String name = "Bharath";
    static int j = 2;
    private int k = 3;


    public int getI() {
        return this.i;
    }

    public void setI(int i) {
        this.i = 8;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getK() {
        return this.k;
    }

    public void setK(int k) {
        this.k = k;
    }


    /*public int geti(){
        return i;
    }

    public void seti(int i){
        this.i=i;
    }

    public String getname(){
        return name;
    }*/

    void display1(){
        System.out.println("In the display");
    }

    public static void main(String[] args) {
        Encapsulation eObj = new Encapsulation();
        System.out.println(eObj.i+" "+eObj.name+" "+Encapsulation.j);
        eObj.display1();
        
            
    }
    

    Encapsulation(){
        this(100);
        System.out.println("In the constructor");
    }

    Encapsulation(int i){
        System.out.println("In the constructor"+" "+i);

    }

    static class NestedClass{
        int z;
        void nestDisplay(){

            System.out.println("In nested display");
        }
        public static void main(String[] args) {
            
        }
         
    }
    
}

class SecondClass{

    void hello(){
        System.out.println("in the hello method");
    }
    public static void main(String[] args) {
        Encapsulation rObj = new Encapsulation();
        rObj.setI(10);
        System.out.println("In the second class"+"  "+rObj.getI()+" "+rObj.getName());
        rObj.display1();
       // SecondNested aObj = new SecondNested();
        
    }

    class SecondNested{

        SecondNested(){
            Encapsulation qObj = new Encapsulation();
            System.out.println("In the secondnested constructore"+qObj.getI());
        }
        
    }
}

class Sub extends Encapsulation{

    void display(){
        System.out.println("In the extended"+j);
    }

    public static void main(String[] args) {
        Encapsulation nObj = new Encapsulation();
        System.out.println("In the extended main method"+nObj.getI());
        

    }
}

class Super extends Sub{

    public static void main(String[] args) {
        System.out.println();//I have created instance in sub class and I extended sub. Even though I have to create 
    }//again instance for Encapsulation.
}