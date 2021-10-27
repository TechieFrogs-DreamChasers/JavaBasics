package PRACTICE.TypeCasting;

public class Demo {
    
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.eat();
        cat.meow();
        Animal animal =cat;//(Animal)cat-upcasting to parent class internally
        animal.eat();
        //animal.meow();- not possible
        cat.meow();
        display(cat);
        display1(cat);
        //Object obj = cat;//upcasting to Object class
        Dog dog = new Dog();
        Animal animal1 = dog;
        display(animal1);//here we will get ClassCastException,since we are passing Dog class upcasting to animal
        //and in display we are refering downcasted Cat
        //In order to remove ClassCast Exception we added instanceof operator
    }
    static void display3(){

    }
    static void display(Animal animal){
        System.out.println(Animal.i);
       // System.out.println(animal.j);cannot access since it is in cat class
       if(animal instanceof Cat){   
            System.out.println(((Cat)animal).j);
            System.out.println(animal);//this is downcasting now can access
       }
    }
    static void display1(Interface1 inter){
        System.out.println(Interface1.k);
    }
}

class Animal{
    static int i;
    int m;
    public Animal(){
        i++;
    }
    static void disp(){
        System.out.println(i+" ");
    }
    public  void eat(){
        
        System.out.println("Animal eats");
    }
}
class Cat extends Animal implements Interface1{
    int j;
    public  void eat(){
        System.out.println("In cat's eat"); 
    }
    public  void meow(){
        System.out.println("Cat says meow");
    }
}
interface Interface1{
    final int k=10;
    public void eat();

}
class Dog extends Animal{
    public void eat(){
        System.out.println("In dog eat");
    }
    public void bark(){
        System.out.println("Bark bark");
    }
}