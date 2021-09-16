package polymorphism;

public class Pn {
    void display(int a, int b){
        System.out.println("two integers" + " "+ a+ " "+b);
    }
    void display(String i, String j){
        System.out.println("two String values"+ " "+ i+" "+j);
    }
    void display(char k, float l, double z){
        System.out.println("cha, float, double values"+" "+k+" "+l+" "+z);
    }
    public static void main(String[]args){
        Pn ob =new Pn();
        ob.display("name", "number");
        ob.display('A', 10.0F,50.0D);
        ob.display(10, 20);

    }
}
