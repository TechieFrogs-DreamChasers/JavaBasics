package polymorphism;

public class Dor {
    void getDor(){
        System.out.println("I got a degree");
    }
    class Ug extends Dor{
        void getDor(){
            super.getDor();
            System.out.println(" I am an undergraduate");
        }
    }
    class Pg extends Dor{
        void getDor(){
            System.out.println(" I am a prostgraduate");
        }
    }
    public static void main(String[]args){
        Dor ob = new Dor();
        ob.getDor();
       Dor.Ug ob1 = ob.new Ug();
ob1.getDor();
    }
}
