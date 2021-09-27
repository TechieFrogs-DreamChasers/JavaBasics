package InterfacesExercise.Programmm7;
import InterfacesExercise.Program7.Vehicle;
import InterfacesExercise.Programm7.Car;
public class FourWheeler extends Car{
    public static void main(String... args){
       // Car car = new Car();
        //Car.Honda honda = car.new Honda();
        FourWheeler four = new FourWheeler();
        Vehicle vehicleObj = four.fourWheeler(four);
        System.out.println(vehicleObj);
        
    }

    Vehicle fourWheeler(FourWheeler four){
       Honda honda = four.new Honda();
       return honda;
    }
    /*public class Ford extends Honda{
        
        Vehicle display(){
            speed();
            return new Car.Honda();
        }
    } */
    
}
