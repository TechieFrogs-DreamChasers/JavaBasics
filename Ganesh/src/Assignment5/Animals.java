package Assignment5;

public abstract class Animals {
    abstract void cats();
    abstract void dogs();
    public static void main(String[] args) {
        Cats c = new Cats();
        c.cats();
        Dogs d = new Dogs();
        d.dogs();
    }
}
class Cats extends Animals {
    void cats(){
        System.out.println("Cats Meow");
    }
    void dogs(){

    }
}
class Dogs extends Animals {
    void dogs(){
        System.out.println("Dogs Bark");
    }
    void cats(){
        
    }

   
}