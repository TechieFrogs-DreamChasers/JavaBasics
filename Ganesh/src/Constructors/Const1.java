package Constructors;

public class Const1 {
    String name;
    public Const1(){
        this.name = "Ganesh";
    }
    public Const1(String s){
      this.name = s;
    }
    public void getName() {
        System.out.println("Programming Language :" + this.name);
    }
    public static void main(String[] args){
        Const1 Obj1 = new Const1();
        Const1 Obj2 = new Const1("Ganesh krishna.T");
        Obj1.getName();
        Obj2.getName();

    }
}
