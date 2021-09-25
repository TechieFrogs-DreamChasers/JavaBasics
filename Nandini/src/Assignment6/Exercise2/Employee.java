package Assignment6.Exercise2;

public class Employee implements Measurable {

    String name;
    double salary;

    Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }

    public double getMeasure() {
        
        return salary;
    }

    static double average(Measurable[] objects){

        double total = 0;
        for(Measurable measure:objects){
            total += measure.getMeasure();    
        }

        return total/objects.length;  
    }
    

}
