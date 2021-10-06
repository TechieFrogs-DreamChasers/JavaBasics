package com.Practice.Interface.Scenarios.scenario3;
//local interfaces and classes
public interface Calculations {
    default void showCalc(){
        System.out.println("Default/Instance method showCalc() in interface");
        //public,private,protected,static,final are not allowed
        interface Cube{
             double PI=3.14;
             void calCube(int n);
             static void show(){
                 System.out.println("Static method in local interface");
             }
             default void display(){
                 System.out.println("Default/Instance method in local interface");
             }
        }
    }
    default void showOps(){
        System.out.println("Default/Instance method showOps() in interface");
         class ShowCalculations{
            interface Square{
                int num=5;
                void calSquare(int n);
                default void showSquare(int n){
                    int sq=n*n;
                    System.out.println("The square of n: "+sq);
                }
            }
            ShowCalculations sc=new ShowCalculations();
            Square sq=new Square() {
                @Override
                public void calSquare(int n) {
                    System.out.println("Square of n: "+(n*n));
                }
            };


         }
    }

    public static void main(String[] args) {
        Calculations calculations=new Calculations() {
            @Override
            public void showCalc() {
                Calculations.super.showCalc();
            }

            @Override
            public void showOps() {
                Calculations.super.showOps();
            }
        };
        calculations.showCalc();
        calculations.showOps();
    }
}
