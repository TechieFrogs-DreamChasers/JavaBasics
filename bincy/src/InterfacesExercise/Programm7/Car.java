
package InterfacesExercise.Programm7;
import InterfacesExercise.Program7.Vehicle;
public class Car {
    protected class Honda implements Vehicle{
        public void speed(){
            System.out.println("Speed of Honda");
        }
    }
}
