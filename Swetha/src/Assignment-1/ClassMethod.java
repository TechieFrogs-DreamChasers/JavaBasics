class Car{
    int size;
    String model;
    void Speed(){ 
        System.out.println("Have 120 kmpl");
    }

    void size(){
        System .out.println("x volume of size");
    }
    public class ClassMethod {
    int num;
    String name;
    void display(){
        System.out.println("Method in Class");//we can have multiple methods in class level
    }
    public static void main(String [] args){
        int i=10;
    ClassMethod clm = new ClassMethod();
        System.out.println(clm.num +" "+clm.name +" "+ i);
        clm.display();//we cannot have method in other method but we can call other methods
         Car carobj=new Car();
         carobj.size();
    }
}
}

