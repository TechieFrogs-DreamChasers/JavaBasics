package PRACTICE;

public abstract class AbstractClassDemo {
    final static int number=3;
    private int length;
    private int breadth;

    protected abstract void display();
    private static void myDisplay(){
        System.out.println("In myDisplay");
    }
    private void privateDisplay(){
        System.out.println("In private display");
    }

    final int finalDisplay(){
        return number;
    }
    AbstractClassDemo(){
        System.out.println("In constructor");
    }
    AbstractClassDemo(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    static class Parent extends AbstractClassDemo{
        protected void display(){

        }

    }

    final class Son{

    }
    private abstract class Daughter{

    }
}
