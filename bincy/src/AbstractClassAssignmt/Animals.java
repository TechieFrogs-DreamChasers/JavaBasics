package AbstractClassAssignmt;

public abstract class Animals {
    public abstract void cats();
    public abstract void dogs();
}

class Cats extends Animals{
    public void cats(){
        System.out.println("Cats meow");
    }
}

class Dogs extends Animals{
    public void dogs(){
        System.out.println("Dogs bark");

    }

    public static void main(String[] args){
        Cats cat = new Cats();
        cat.cats();
        Dogs dog = new Dogs();
        dog.dogs();
    }
}
