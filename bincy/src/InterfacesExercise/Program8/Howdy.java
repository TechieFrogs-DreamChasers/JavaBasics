package InterfacesExercise.Program8;

public interface Howdy {
    void  display();
}
class HowdyClass{
    public Howdy show(){
        class Inner implements Howdy{
            public void display(){
                System.out.println("This is from display of Howdy");
                
            }
        }
        return new Inner();
    }
    public static void main(String... args){
        HowdyClass howdy = new HowdyClass();
        Howdy how = howdy.show();
        how.display();
    }
}
