package InterfacesExercise.Programmm7;
import InterfacesExercise.Program7.Vehicle;
import InterfacesExercise.Programm7.Car;
public class FourWheeler extends Car{
    public static void main(String... args){
       // Car car = new Car();
        //Car.Honda honda = car.new Honda();
        FourWheeler four = new FourWheeler();
        FourWheeler.Ford ford = four.new Ford();
        ford.display();
    }
    void fourWheeler(){
       
    }
    public class Ford extends Honda{
        
        Vehicle display(){
            speed();
            return new Car.Honda();
        }
    } 
    
}
