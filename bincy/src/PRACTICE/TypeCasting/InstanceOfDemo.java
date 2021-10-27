package PRACTICE.TypeCasting;

public class InstanceOfDemo {
    public static void main(String[] args){
        makeItMove(new Fish());
        makeItMove(new Bird());
        makeItMove(new Kangaroo());
    }

    public static void makeItMove(Animals animal){
        if (animal instanceof Fish){
        Fish fish = (Fish)animal;
        fish.swim();
        }
        else if (animal instanceof Bird){
        Bird bird = (Bird)animal;
        bird.fly();
        }
        else if (animal instanceof Kangaroo){
        Kangaroo kangaroo = (Kangaroo)animal;
        kangaroo.jump();
        }
    }
}
    class Animals {}
       
    class Fish extends Animals{
        void swim(){
            System.out.println("Swim");
            
        }
    }
    class Bird extends Animals {
        void fly(){
            System.out.println("Fly");
            
        }
    }
    class Kangaroo extends Animals {
        void jump(){
            System.out.println("Jump");
        }
    }

    