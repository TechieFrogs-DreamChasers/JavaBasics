package InterfacesExercise;

public class Employee  implements Measurable{ //2.
    public double getMeasure(){
        return 3.5;
    }
    double average(Measurable[] ob){
         return 3.5;
    }

    public static void main(String... args){
        Employee emp = new Employee();
        System.out.println(emp.getMeasure());
    }
}
