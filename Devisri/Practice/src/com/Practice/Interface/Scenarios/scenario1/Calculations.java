package com.Practice.Interface.Scenarios.scenario1;

//Concrete class
public interface Calculations {
    //constants
    int x = 10;
    int y = 20;

    //abstract methods
    void subtraction(int a, int b);

    void Multiplication(int a, int b);

    //default/instance method
    default void showCalc() {
        System.out.println("Implementation In Interface Method:");
        int num1 = 50;
        int num2 = 20;
        System.out.println("The subtraction of num1-num2: " + (num1 - num2));
        class Subtraction {
            public Subtraction() {
                System.out.println("showCalc()->Local class->Subtraction()");
            }

            void diff(int a, int b) {
                System.out.println("The difference of a-b: " + (a - b));
            }
        }
        Subtraction sub = new Subtraction();
        sub.diff(y, x);
    }

    //private/default/protected not allowed. Because its by default,public
    //abstract reference coming to class is mandatory.
    //final is allowed. By default, static & public
    class Addition {
        //final,static,public,protected,private are allowed for methods
        public Addition() {
            System.out.println("Inside Calculations Interface-> Class Addition->Constructor in Addition()");
        }

        void add() {
            System.out.println("Addition of x+y: " + (x + y));
            //Local inner class is allowed. No modifiers / static is allowed
            class Sum {
                //final,static,public,protected,private are allowed for methods
                void l_sum_Add(int a, int b) {
                    System.out.println("Sum of a+b:" + (a + b));
                }
            }
            Sum sum = new Sum();
            sum.l_sum_Add(50, 50);
        }

        /*public static void main(String[] args) {
            Addition addition=new Addition();
            addition.add();
        }
        Can have main method in this class also as its a Nested /static class
        */
    }

    public static void main(String[] args) {
        Addition addition = new Addition();
        addition.add();
        Calculations calculations = new Calculations() {
            @Override
            public void subtraction(int a, int b) {

            }

            @Override
            public void Multiplication(int a, int b) {

            }
        };
        calculations.showCalc();
    }
}
