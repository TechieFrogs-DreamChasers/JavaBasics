public class Variables {
    int i = 30;  //instance variable
    //final int j=40;
    final int j;  //final variable
    float k = 100; //instance variable
    //static int z=100;
    static int z;//static variable
    {
       j=40;
       z=100;   // Initialization Block

    }
   // static final double PI = 3.14;
    static final double PI; //Constants
    static
    {
    PI = 3.14; //Variables of Static and final are assigned only in Static block
    }
    public static void main(String... args) {     
            System.out.println("Learning Variables");
        int i = 10; //local variable
        Variables v = new Variables();
        System.out.println(v.i+"  "+i);
        System.out.println("Static Value"+" "+z);
        //v.j=150;
        Variables v1= new Variables();
        v1.k=500;
        System.out.println(v.k+"  "+v1.k);
        System.out.println("Value of PI is="+" "+v.PI);
        v.i++; //incrementing the i valve instance variable
        System.out.println("Value of i="+" "+v.i);
        i++; // incrementing the local variable i
        System.out.println("The Value of local variable i=" +" "+ i);


    }
    public void main() {
        int i = 20; //local variable
    } 

    public static void main(int i) {
    
}

    
}
