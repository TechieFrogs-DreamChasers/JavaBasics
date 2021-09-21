package com.Practice.Interface.Scenarios.scenario2;

import com.Practice.Abstraction.Caluclations.Modulus;

//Abstract classes
public interface Caluclations {
    //constants
    int x=100;
    int y=200;
    //Abstract methods
    void addition(int a,int b);
    void subtraction(int a,int b);
    //abstract class
    abstract class Multiplication{
        Multiplication(){
            System.out.println("Interface->Abstract class->Multiplication->Constructor");
        }
        //here abstract keyword is mandatory. Not like interfaces
        abstract void multiply(int a,int b);
        void multiply(float a,float b){
            System.out.println("The multiplication of two floats: "+(a*b));
        }
        //int multiply(int a,int b){}// it did not allow. Both methods have same erasure
    }
    abstract class Division{
        public Division(){
            System.out.println("Interface->abstract class->Division->constructor");
        }
        void divide(int a,int b){
            System.out.println("***The division of two int's: "+(a/b));
            class Modulus {
                Modulus(){
                    System.out.println("Interface->abstract class->divide(f,f)->local class->Modulus()");
                }
                void rem(int a,int b){
                    System.out.println("**The remainder of two int's: "+(a%b));
                }
            }
            Modulus mod=new Modulus();
            mod.rem(10,5);
        }
        void divides(float a,float b){
            System.out.println("The division of two float's: "+(a/b));
            //abstract,final are allowed for local inner class
            abstract class Mod{
                public Mod(){
                    System.out.println("Interface->local abstract class->divide(f,f)->abstract class->Mod()");
                }
                abstract void remainder(int a,int b);
                void remainder(float a,float b){
                    System.out.println("The remainder of two floats: "+(a%b));
                }
            }
            Mod mod=new Mod() {
                @Override
                void remainder(int a, int b) {
                    System.out.println("****"+(a%b));
                }
            };
            mod.remainder(50,2);
            mod.remainder(30.0f,6.0f);
        }
    }


}
