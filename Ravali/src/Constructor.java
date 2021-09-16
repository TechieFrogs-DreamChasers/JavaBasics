 
 class car{
     int size;
     String model;
     void size(){
         System.out.println(" This is 1st method of Car class");
     }
     void speed(){
         System.out.println(" This is 2nd method of car class");
     }
    // public static void main(String[]args){
   //      System.out.println(" This is Car class main method ");
    // }
         
       
     
 }
     public class Constructor{
     int a;
     int b;
     String s;
     static String l;
     void display(){
         System.out.println(" This is a display method");
         System.out.println(" default values of int and string"+" "+ a +" " + s + " " +b);
     }
     public static void main( String[]args){
        Constructor sampleobj = new Constructor(); //creating object for int a;b
        sampleobj.display();
        System.out.println(" This is main method of constructor class");
       // sampleobj.l="hi";
       // System.out.println(sampleobj.l);
       Constructor.l="hello";
       Constructor.l="overriding";
       System.out.println("static variable"+" "+Constructor.l);

    sampleobj.a=10;
    sampleobj.b=20;
    sampleobj.b=30;
    System.out.println("addition of two instances"+ " "+ sampleobj.a +" "+sampleobj.b+" "+(sampleobj.a+sampleobj.b));
        car carobj = new car();
        carobj.size();
        carobj.speed();
       



     }
 }