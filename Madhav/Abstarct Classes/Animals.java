public abstract class Animals {
    
    abstract void cats();
    abstract void dogs();
    
    public static void main(String[] args) {
        Cats cat=new Cats();
        Dogs dog = new Dogs();
        cat.cats();
        dog.dogs();
    }
    
}
class Cats extends Animals{
    void cats()
    {
        System.out.println("Cats Meow");
    }
    void dogs()
    {

    }
}
class Dogs extends Animals{
    void dogs()
    {
        System.out.println("Dogs bark");
    }
    void cats()
    {

    }

    

}