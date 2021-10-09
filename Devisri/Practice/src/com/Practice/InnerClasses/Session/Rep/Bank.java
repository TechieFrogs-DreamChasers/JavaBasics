package com.Practice.InnerClasses.Session.Rep;

//Focuses on Local classes
public class Bank {
    // same rules apply as all classes

    Bank() {
        System.out.println("Bank()");
        // Local class in outer class constructor
        class Atm {
            Atm() {
                System.out.println("Atm()");
            }
        }
        // Local class instantiation
        Atm atm = new Atm();
    }

    // Outer class static method
    static void show_Withdrawal() {
        // method body
        // Method Local class
        class Withdrawal {
            Withdrawal() {
                System.out.println("Withdrawal()");
            }
        }
        // Method Local class instantiation
        Withdrawal withdrawal = new Withdrawal();
    }

    // Outer class instance method
    private void show_Deposit() {

        // Methods can have initialization blocks not static blocks
        // Because local variables can't be static
        // method body
        // Method Local class
        class Deposit {
            {

            }

            static {

            }

            Deposit() {
                System.out.println("Deposit()");
            }
        }
        // Method Local class instantiation
        Deposit deposit = new Deposit();
    }

    public static void main(String[] args) {
        // Outer class instantiation
        Bank bank = new Bank();
        // accessing static method of outer class
        Bank.show_Withdrawal();
        // accessing instance method of outer class
        bank.show_Deposit();

    }

}
