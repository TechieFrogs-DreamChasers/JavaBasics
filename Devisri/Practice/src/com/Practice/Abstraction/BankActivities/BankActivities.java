package com.Practice.Abstraction.BankActivities;

public abstract class BankActivities {
    //constructor
    BankActivities(){
        System.out.println("abstract->BankActivities->BankActivities()");
    }

    //2 abstract methods
    public abstract double deposit();

    public abstract double withdrawal();

    //Inner class Deposit
    class Deposit {
        //Deposit class instance method
        void inn_display() {
            System.out.println("This is inner class Deposit in BankActivities inn_display()");
            //Local class InnDeposit
            class InnDeposit {
                //Local class constructor
                public InnDeposit() {
                    System.out.println("BankActivities->Deposit class->inn_display()->InnDeposit class->InnDeposit()");
                }
            }
            //Local class Object creation
            InnDeposit innDeposit = new InnDeposit();
        }
    }

    //Nested class
    static class Withdrawal {
        //Withdrawal class instance method
        void inn_show() {
            System.out.println("This is nested class Withdrawal in BankActivities inn_show()");
            //Local class InnWithdrawal
            class InnWithdrawal {
                //Local class constructor
                public InnWithdrawal() {
                    System.out.println("BankActivities->static Withdrawal class->inn_show()->InnWithdrawal class->InnWithdrawal()");
                }
            }
            //Local class object creation
            InnWithdrawal innWithdrawal = new InnWithdrawal();
        }
    }

    // abstract inner class
    public abstract class Loans {
        //abstract inner class abstract methods
        public abstract void carLoan();

        public abstract void homeLoan();
    }

    //BankActivities instance method
    public void display() {
        System.out.println("This is Bank Activities Abstract Class display()!!!");
    }

    //BankActivities static method
    public static void show() {
        System.out.println("This is Bank Activities Abstract class static show()!!!");
    }

}
