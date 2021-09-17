public class A {
    int i;
    int j;
    void show(){
        System.out.println("print values of : " + i+","+j);
    }
    A(int a, int b){

    }
    
}

class B extends A {
    int k;
    void show(){
        System.out.println("print value:"+ k);
    }

    B(int a){
     
        super(10,15);
        this.k=a;
    

    }
    public static void main(String[] args) {
        B ob =  new B(10);
        ob.show();

    } 

}
    

