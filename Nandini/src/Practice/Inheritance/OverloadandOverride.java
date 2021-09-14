package Practice.Inheritance;

//Employee1 and ParttimeEmo are the parent and child classes.

public class OverloadandOverride {

    public static void main(String[] args) {
        
        Employee1 emp1 = new Employee1();
        ParttimeEmo emp2 = new ParttimeEmo();

        emp1.setId(101);
        emp1.setName("John");

        emp2.setId(102);
        emp2.setName("Sam");
        emp2.setHrsWorked(40);
        emp2.setRate(34.88);

        emp1.display();
        System.out.println();

        //overloading parent and chid class 
        /*emp2.display();
        emp2.display("Parttime Employee Information");*/

        //Overriding
        emp2.display(); //only displaying child class display methhod; to overcome this 
        //Add Super.display(); in child class display method.

    }
    
}
