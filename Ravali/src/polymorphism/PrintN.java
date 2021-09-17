package polymorphism;


public class PrintN {
    int i;
    void PN(){
        System.out.println(i);
    }
    class j extends PrintN{
        int j;
        void PN(){
            System.out.println(j);
        }
    }
    public static void main(String[]args){
        PrintN ob1 = new PrintN();
        PrintN.j ob = ob1.new j();
ob.i=10;
System.out.println(ob.i);
ob.j=20;
System.out.print(ob.j);
    }
    
}
