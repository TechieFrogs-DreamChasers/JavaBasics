package com.Practice.InnerClasses.Session.Rep;
//Focuses on Inner classes
public class EITeacher {
    //Can have static + Instance + Final Variables

    // Blocks {Initialization} + {Static}

    //n(Number of Constructors)

    //n(Number of Methods final + static + instance

    //n(Nested Classes using static keyword)

    //n(Inner Classes) = Non-Static Class

    //Can have Abstract Nested/Inner classes

    //Can have Nested & Interface
    private class Car {
        //Can have static + Instance + Final Variables

        // Blocks {Initialization} + {Static}

        //n(Number of Constructors)

        //Can access outer class static methods / variables

        //Can access instance variables/methods of outer class

        //n(Number of Methods final + static + instance

        //n(Nested Classes using static keyword)

        //n(Inner Classes) = Non-Static Class

        //Cannot have a main method

        class CarLoan {
            //This is a deep Inner class
        }
    }

    //Driver class main method
    public static void main(String[] args) {
        //Outer class object is needed for inner class Object Creation
        //Outer class instantiation

        EITeacher teacher = new EITeacher();

        //Inner class instantiation

        EITeacher.Car car = teacher.new Car();

        //Deep Inner class instantiation

        Car.CarLoan carLoan = car.new CarLoan();

    }
}
