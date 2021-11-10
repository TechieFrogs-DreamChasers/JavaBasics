package PRACTICE.Step2;

public class FinalizeMethod {
    int a;
    String name;
    public static void main(String[] args){
        FinalizeMethod f = new FinalizeMethod();
        System.out.println(f.toString());
        f=null;
        System.gc();//Explicitly calling the garbage collector

    }
    FinalizeMethod(){
        a=20;
        name = "Smith";
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Eligible for garbage collection");
    }
    @Override
    public String toString() {
        return a+" "+ name;
    }
}
