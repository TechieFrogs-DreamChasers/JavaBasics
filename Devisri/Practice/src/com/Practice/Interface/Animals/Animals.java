package com.Practice.Interface.Animals;

public interface Animals {
    String name="Animal";
    //boolean arePets = false;//allowed
    //private int id=1;//modifier private is not allowed
    void eat();
    void move();

    private void friendly(){
        System.out.println("In Interface Animals -> Some animals are friendly!!!");
    }

    default void arePets(){
        System.out.println("In Interface Animals -> Some Animals are adopted as Pets!!!");
    }

    public static void main(String[] args) {
        Animals animals=new Animals() {
            @Override
            public void eat() {
                System.out.println("In Interface Animals -> Animals Eat!!!");
            }

            @Override
            public void move() {
                System.out.println("In Interface Animals -> Animals Move!!!");
            }
        };
        animals.friendly();
        animals.eat();
        animals.move();
        animals.arePets();
    }

}
