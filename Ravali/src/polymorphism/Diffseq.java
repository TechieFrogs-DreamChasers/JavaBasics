package polymorphism;

public class Diffseq {
    void display(int a,char b){
        System.out.println("sequence 1: "+" "+a+" "+b);

    }
    void display(char b, int a){
        System.out.println("Sequence 2:"+ " "+b+" "+a);
    }
    public static void main(String[]args){
        Diffseq ob = new Diffseq();
        ob.display(10, 'C');
        ob.display('C', 10);

    }
}
