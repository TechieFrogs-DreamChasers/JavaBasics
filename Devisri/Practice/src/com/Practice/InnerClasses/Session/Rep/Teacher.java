package com.Practice.InnerClasses.Session.Rep;
//Focuses on combination of Nested & Inner classes
public class Teacher {
    //Nested class
    private static class Home {
        //Deep Inner class
        class HomeLoan {

        }

        //Nested class main
        public static void main(String[] args) {
            //Outer class instantiation
            Teacher teacher = new Teacher();
            //Nested class instantiation
            Home home = new Home();
            //Deep Inner class instantiation
            Home.HomeLoan homeLoan = home.new HomeLoan();
        }
    }

    //Inner class
    protected class Car {
        //Deep Nested class
        static class CarLoan {
            //Deep Nested class main
            public static void main(String[] args) {
                //Outer class Instantiation
                Teacher teacher = new Teacher();
                //Inner class Instantiation
                Teacher.Car car = teacher.new Car();
                //Deep Nested class Instantiation
                CarLoan carLoan = new CarLoan();
            }
        }
    }

    //Driver class main
    public static void main(String[] args) {
        //Outer class instantiation
        Teacher teacher = new Teacher();
        //Nested class instantiation
        Home home = new Home();
        //Deep Inner class instantiation
        Home.HomeLoan homeLoan = home.new HomeLoan();
        //Inner class Instantiation
        Teacher.Car car = teacher.new Car();
        //Deep Nested class Instantiation
        Car.CarLoan carLoan = new Car.CarLoan();
    }
}
