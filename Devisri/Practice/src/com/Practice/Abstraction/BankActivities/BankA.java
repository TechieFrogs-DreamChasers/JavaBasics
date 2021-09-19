package com.Practice.Abstraction.BankActivities;

public class BankA extends BankActivities {
    //Implementing BankActivities abstract methods
    @Override
    public double deposit() {
        return 200000.0;
    }

    @Override
    public double withdrawal() {
        return 100000.0;
    }

    //Nested abstract class
    abstract static class Account {
        //Constructor
        public Account() {
            System.out.println("BankA->abstract->static->Account->Account()");
        }

        //Nested class abstract method
        abstract void acc_Details(String name, double balance);

        // Nested class instance method
        public void acc_Inn_display() {
            System.out.println("BankA->static->Nested Account class->acc_Inn_display()");
            //Local class
            abstract class InnAccount {
                //Local class constructor
                public InnAccount() {
                    System.out.println("BankA->static->Nested Account class->acc_Inn_display()->Local class->abs InnAccount->InnAccount()");
                }

                //Local class instance method
                void inn_acc_meth() {
                    System.out.println("Normal method in nested local abstract class ");
                }
            }
            //Local abstract class access using Anonymous inner class
            InnAccount acc = new InnAccount() {
            };
            acc.inn_acc_meth();
        }

    }

    //Inner abstract class Customer
    abstract class Customer {
        //constructor
        public Customer() {
            System.out.println("BankA->abstract->Customer->Customer()");
        }

        //instance method
        public void inn_cus_details() {
            System.out.println("BankA->Inner Customer class->inn_cus_details()");
            //Local class
            class InnCustomer {
                //constructor
                public InnCustomer() {
                    System.out.println("BankA->inner abstract class->Customer->inn_cus_details()->Local class->InnCustomer->InnCustomer()");
                }

                //instance method
                void cus_Inn_Show() {
                    System.out.println("Inside Local class cus_Inn_Show()");
                }
            }
            //Object creation
            InnCustomer cus = new InnCustomer();
            cus.cus_Inn_Show();
        }

    }
}
