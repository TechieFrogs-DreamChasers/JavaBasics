package Practice.TypeCasting;

import java.util.ArrayList;
import java.util.List;

public class UpCasting {
    public static void main(String[] args) {
        
        //Animal animal = new Animal();
        Cat c = new Cat();
        Animal animal = c;
        animal = (Animal)c;
        
        AnimalFeeder af = new AnimalFeeder();
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        af.feed(animals);
        

        
    }
}
    
    class Animal{
        public void eat(){
            System.out.println("Eating");
        }
    }

    class Cat extends Animal{
        public void eat(){
            System.out.println("Cat Eat");
        }

        public void meow(){
            System.out.println("Cat Meow");
        }
    }

    class Dog extends Animal{
        public void eat(){
            System.out.println("Dog eat");
        }
    }

    class AnimalFeeder{

        public void feed(List<Animal> animals){
            animals.forEach(animal ->{
                animal.eat();
                if(animal instanceof Cat){
                    ((Cat)animal).meow();
                }
            });
        }
    }

