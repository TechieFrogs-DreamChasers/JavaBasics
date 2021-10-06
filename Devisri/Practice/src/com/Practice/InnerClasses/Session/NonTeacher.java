package com.Practice.InnerClasses.Session;

//consists of an Outer class--> an Inner Class--> Inner Class
public class NonTeacher {
    //Outer class NonTeacher Variables static+Non-static
    String name;
    static int id;

    //Outer Class NonTeacher default constructor
    NonTeacher() {
        System.out.println("Teacher Class ---> NonTeacher() ---> called!!!");
    }

    public NonTeacher(String name) {
        this();
        System.out.println("NonTeacher Class ---> NonTeacher(parameter) ---> called!!!");
        this.name = name;
        NonTeacher.id = 5128;
    }

    //Outer Class NonTeacher static method
    static void teacher_Show() {
        System.out.println("NonTeacher Class ---> static teacher_Show() ---> called!!!");
        //Accessing Outer class static variable here
        System.out.println("NonTeacher id: " + NonTeacher.id);
    }

    //Outer Class NonTeacher instance method
    void teacher_Details() {
        System.out.println("NonTeacher Class ---> teacher_Details() ---> called!!!");
        //Can access instance+static variables
        System.out.println("NonTeacher Name: " + name + " Id: " + NonTeacher.id);
        //can call static method inside instance method
        NonTeacher.teacher_Show();
    }

    //Teacher Has-A Car
    //Inner Class name Car
    class Car {
        //Inner class can have static + instance variables
        static String car_name;
        int bought_Year;

        //Inner class default constructor
        Car() {
            System.out.println("NonTeacher Class ---> Inner Class Car ---> Car() ---> called!!!");
        }

        //Inner class parameter constructor
        public Car(int bought_Year) {
            this();
            System.out.println("NonTeacher Class ---> Inner Class Car ---> Car(parameters) ---> called!!!");
            Car.car_name = "Ford";
            this.bought_Year = bought_Year;
        }

        //Inner class static method
        static void car_Show() {
            System.out.println("NonTeacher Class ---> Inner Class Car ---> static car_Show() ---> called!!!");
            //Accessing Outer class static variable here
            //System.out.println("NonTeacher id: "+NonTeacher.id);
            System.out.println("NonTeacher's car model name: " + Car.car_name);
            NonTeacher.teacher_Show();//static method of Outer class
        }

        //Inner class instance method
        void car_Details() {
            System.out.println("NonTeacher Class ---> Inner Class Car ---> static car_Show() ---> called!!!");
            //Accessing Outer class static variable here
            //Even though it's an instance method we can call static + instance variable names of outer class here
            System.out.println("Teacher id: " + NonTeacher.id + " Name: " + name);
            System.out.println("NonTeacher's car model name: " + Car.car_name + " Bought in: " + bought_Year);
            Car.car_Show();//static method of Inner class Car
            NonTeacher.teacher_Show();//static method of outer class NonTeacher
        }

        class CarLoan {
            //Can have static + instance variables
            static int emi_Per_Month;
            static int no_Of_Years;

            //Deep Inner class constructor
            CarLoan() {
                System.out.println("NonTeacher Class ---> Inner Class Car ---> Deep Inner Class CarLoan ---> CarLoan() called!!!");
                CarLoan.emi_Per_Month = 25000;
                CarLoan.no_Of_Years = 5;

            }

            //Deep Inner class instance method
            void car_loan_Details() {
                System.out.println("NonTeacher Class ---> Inner Class Car ---> Deep Inner Class CarLoan ---> car_loan_Details() called!!!");
                System.out.println("Teacher Name: " + name + " Id: " + Teacher.id);
                System.out.println("Car Model Name: " + Car.car_name + " Bought in: " + bought_Year);
                System.out.println("Car's EMI per month: " + CarLoan.emi_Per_Month + "rs. Years to finish loan: " + no_Of_Years);
                teacher_Details();
                car_Details();
                Car.car_Show();
                NonTeacher.teacher_Show();
            }
        }
    }

    //Driver class main() method
    public static void main(String[] args) {
        NonTeacher teacher = new NonTeacher("Evan");
        NonTeacher.Car car = teacher.new Car(2015);
        Car.CarLoan carLoan = car.new CarLoan();
        carLoan.car_loan_Details();
    }
}
