package InterfacesExercise.Program5;

public class Sandwich implements FastFood {
    public void burger(){
        System.out.println("I love IN N OUT");
    }
    public void pizza(){
        System.out.println("I love thin crest");
    }
    public void hotdog(){
        System.out.println("I love grilled ");
    }
    public static void main(String... args){
        Sandwich sand = new Sandwich();
        sand.burger();
        sand.hotdog();
        sand.pizza();
    }
}
interface FastFood{
    void burger();
    void pizza();
    void hotdog();

}
