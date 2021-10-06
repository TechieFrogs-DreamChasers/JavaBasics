package com.Practice.InnerClasses.Session.Rep;

//Focuses on Nested classes
public class ENTeacher {
    // Can have static + Instance + Final Variables

    // Blocks {Initialization} + {Static}

    // n(Number of Constructors)

    // n(Number of Methods final + static + instance

    // n(Nested Classes using static keyword)

    // n(Inner Classes) = Non-Static Class

    // Can have Abstract Nested/Inner classes

    // Can have Nested & Interface
    protected static class Car {

        // Can have static + Instance + Final Variables

        // Blocks {Initialization} + {Static}

        // n(Number of Constructors)

        // Can access outer class static methods / variables

        // Cannot access instance variables/methods of outer class

        // n(Number of Methods final + static + instance

        // n(Nested Classes using static keyword)

        // n(Inner Classes) = Non-Static Class

        // Can have a main method
        private static class CarLoan {
            // This is a deep Nested class
            // Can have main method
        }

        public static void main(String[] args) {
            // Nested class access
            Car car = new Car();
            // Deep Nested class access
            CarLoan carLoan = new CarLoan();
        }
    }

    // Driver class main method
    public static void main(String[] args) {
        // Outer class instantiation
        ENTeacher enTeacher = new ENTeacher();
        // Nested class instantiation
        Car car = new Car();
        // Deep Nested class instantiation
        Car.CarLoan carLoan = new Car.CarLoan();
    }
}
