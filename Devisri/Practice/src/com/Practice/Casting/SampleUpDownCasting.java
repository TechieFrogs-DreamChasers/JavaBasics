package com.Practice.Casting;
/*
*In java, upcasting is not necessary as it's done automatically.
*It's usually referred as implicit casting and Upcasting can never fail.
* But if you have a group of different Dogs and want to downcast them all to their types, then there's a
chance, that some of these Dogs are actually of different types i.e.,
PetDog, PoliceDog, and process fails, by throwing ClassCastException.
* This is the reason you need to downcast your objects manually if you have
referenced your objects to the super class type.
* Here by referencing means you are not changing the memory address of your objects when you
downcast, it still remains same you are just grouping them to particular type in this case Dog
 */
public class SampleUpDownCasting {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        Dog dog2=new PetDog();
        Dog dog3=new PoliceDog();
        dog1.getType();//Normal Dog
        //Upcasting
        dog2.getType();//Pet Dog
        //Upcasting
        dog3.getType();//Police Dog
        //DownCasting
       ((PetDog)dog2).getDogName();//My Pet Dog is Boomer!!!
        //DownCasting
        ((PoliceDog)dog3).getPoliceDogId();//Police Dog Id is Unknown!!!

    }
}
class Dog{
    public String getType(){
        System.out.println("Normal Dog");
        return "Normal Dog!!!";
    }
}
class PetDog extends Dog{
    @Override
    public String getType() {
        System.out.println("Pet Dog");
        return "Pet Dog!!!";
    }
    public String getDogName(){
        System.out.println("My Pet Dog is Boomer!!!");
        return "Boomer";
    }
}
class PoliceDog extends PetDog{
    @Override
    public String getType() {
        System.out.println("Police Dog");
        return "Police Dog";
    }
    public int getPoliceDogId(){
        System.out.println("Police Dog Id is Unknown!!!");
        return 0;
    }
}