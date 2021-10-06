package com.Practice.InnerClasses.Session;

//consists of an Outer class--> a Nested Class--> Nested Class
public class Teacher {
    //Outer class Teacher Variables static+Non-static
    String name;
    static int id;

    //Outer Class Teacher default constructor
    Teacher() {
        System.out.println("Teacher Class ---> Teacher() ---> called!!!");
    }

    public Teacher(String name) {
        this();
        System.out.println("Teacher Class ---> Teacher(parameter) ---> called!!!");
        this.name = name;
        Teacher.id = 5128;
    }

    //Outer Class Teacher static method
    static void teacher_Show() {
        System.out.println("Teacher Class ---> static teacher_Show() ---> called!!!");
        //Accessing Outer class static variable here
        System.out.println("Teacher id: " + Teacher.id);
    }

    //Outer Class Teacher instance method
    void teacher_Details() {
        System.out.println("Teacher Class ---> teacher_Details() ---> called!!!");
        //Can access instance+static variables
        System.out.println("Teacher Name: " + name + " Id: " + Teacher.id);
        //can call static method inside instance method
        Teacher.teacher_Show();
    }

    //Teacher Has-A Car
    //Nested Class name Car
    static class Car {
        //Nested class can have static + instance variables
        static String car_name;
        int bought_Year;

        //Nested class default constructor
        Car() {
            System.out.println("Teacher Class ---> Nested Class Car ---> Car() ---> called!!!");
        }

        //Nested class parameter constructor
        public Car(int bought_Year) {
            this();
            System.out.println("Teacher Class ---> Nested Class Car ---> Car(parameters) ---> called!!!");
            Car.car_name = "Ford";
            this.bought_Year = bought_Year;
        }

        //Nested class static method
        static void car_Show() {
            System.out.println("Teacher Class ---> Nested Class Car ---> static car_Show() ---> called!!!");
            //Accessing Outer class static variable here
            //System.out.println("Teacher id: "+Teacher.id);
            System.out.println("Teacher's car model name: " + Car.car_name);
            Teacher.teacher_Show();//static method of Outer class
        }

        //Nested class instance method
        void car_Details() {
            System.out.println("Teacher Class ---> Nested Class Car ---> static car_Show() ---> called!!!");
            //Accessing Outer class static variable here
            //Even though it's an instance method we can't call instance variable name of outer class here
            System.out.println("Teacher id: " + Teacher.id);
            System.out.println("Teacher's car model name: " + Car.car_name + " Bought in: " + bought_Year);
            Car.car_Show();//static method of nested class Car
            Teacher.teacher_Show();//static method of outer class Teacher
        }

        //Nested class Car main() method
        public static void main(String[] args) {
            Teacher teacher = new Teacher("Sam");
            Car car = new Car(2018);
            CarLoan carLoan = new CarLoan();
        }

        static class CarLoan {
            //Can have static + instance variables
            static int emi_Per_Month;
            static int no_Of_Years;

            //Deep Nested class constructor
            CarLoan() {
                System.out.println("Teacher Class ---> Nested Class Car ---> Deep Nested Class CarLoan ---> CarLoan() called!!!");
                CarLoan.emi_Per_Month = 25000;
                CarLoan.no_Of_Years = 5;

            }

            //Deep Nested class static method
            static void car_loan_Details() {
                System.out.println("Teacher Class ---> Nested Class Car ---> Deep Nested Class CarLoan ---> car_loan_Details() called!!!");
                System.out.println("Car's EMI per month: " + CarLoan.emi_Per_Month + "rs. Years to finish loan: " + no_Of_Years);
                Car.car_Show();
                Teacher.teacher_Show();
            }

            //Deep Nested class CarLoan main() method
            public static void main(String[] args) {
                Teacher teacher = new Teacher("Tom");
                Car car = new Car(2010);
                CarLoan carLoan = new CarLoan();
            }
        }
    }

    //Driver class main() method
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Frank");
        teacher.teacher_Details();
        Car car = new Car(2012);
        car.car_Details();
        Car.CarLoan carLoan = new Car.CarLoan();
    }
}
