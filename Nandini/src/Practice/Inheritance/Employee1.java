package Practice.Inheritance;

public class Employee1 {

    private int id;
    private String name;

    public int getID(){

        return id;
    }
    public void setId(int id){

        this.id = id;
    }

    public String getName(){

        return name;
    }
    public void setName(String name){

        this.name = name;
    }

    public void display(){

        
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee id: " + getID());
    }


    
}
