package com.Practice.InnerClasses.Session;
//Anonymous classes
//Contains an Abstract class & a Concrete class extending Abstract class
public abstract class MainBank {
    //abstract class variable instance + final
    static final double WITH_LIMIT=100000.0;
    double amount;
    //Abstract class constructor
    public MainBank() {
        this(500.0);
    }
    //abstract class parameterized constructor
    public MainBank(double amount) {
        this.amount = amount;
    }
    //abstract instance method
    void with_Limit(){
         System.out.println("Withdrawal limit: "+MainBank.WITH_LIMIT);
     }
     //abstract method
    abstract void min_Balance();
    //abstract class main method
    public static void main(String[] args) {
        //An abstract class cannot have an object
        //So it got instantiated in anonymous way
        MainBank mainBank=new MainBank() {
            @Override
            void min_Balance() {
                System.out.println("Minimum Balance in this Bank: "+amount);
            }
        };
        mainBank.min_Balance();
        mainBank.with_Limit();
    }
}
//A concrete class extending abstract super class
class SubBank extends MainBank{
//Method implementation
    @Override
    void min_Balance() {
        System.out.println("The Minimum Balance of SubBank: "+amount);
    }
//constructor
    public SubBank(double amount) {
        super(amount);
    }
//Overriding method
    @Override
    void with_Limit() {
        super.with_Limit();
    }
//constructor
    public SubBank() {
        super();
    }
//child class main() method
    public static void main(String[] args) {
        SubBank subBank=new SubBank(100.0D);
        subBank.min_Balance();
        subBank.with_Limit();
        SubBank subBank1=new SubBank(){
            @Override
            void min_Balance() {
                super.min_Balance();
            }

            @Override
            void with_Limit() {
                super.with_Limit();
            }
            {
                System.out.println("Can have Instance Blocks!!!");
            }
            //System.out.println();---> Not allowed
        };
        subBank1.with_Limit();
        subBank1.min_Balance();
        MainBank mainBank=new MainBank() {
            @Override
            void with_Limit() {
                super.with_Limit();
            }

            @Override
            void min_Balance() {
                System.out.println("The min balance is: "+amount);
            }
        };
        //mainBank.amount=200.0D;
        mainBank.min_Balance();
        mainBank.with_Limit();
    }
}


