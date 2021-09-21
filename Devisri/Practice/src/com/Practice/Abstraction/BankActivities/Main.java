package com.Practice.Abstraction.BankActivities;

public class Main {
    public static void main(String[] args) {
        BankActivities ba = new BankActivities() {
            @Override
            public double deposit() {
                return 50000.0;
            }

            @Override
            public double withdrawal() {
                return 20000.0;
            }
        };
        System.out.println(ba.deposit());
        System.out.println(ba.withdrawal());
        System.out.println(" ");
        BankActivities.Loans loans = ba.new Loans() {
            @Override
            public void carLoan() {
                System.out.println("Bank Provides Car Loans!!!");
            }

            @Override
            public void homeLoan() {
                System.out.println("Bank Provides Home Loans!!!");
            }
        };
        loans.carLoan();
        loans.homeLoan();
        System.out.println(" ");
        BankActivities.Withdrawal withdrawal = new BankActivities.Withdrawal();
        withdrawal.inn_show();
        BankActivities.show();
        System.out.println("  ");
        BankA bankA = new BankA();
        BankActivities.Deposit deposit = bankA.new Deposit();
        deposit.inn_display();
        bankA.display();
        bankA.deposit();
        bankA.withdrawal();

        BankA.Account account = new BankA.Account() {
            @Override
            void acc_Details(String name, double balance) {
                name = "Meg";
                balance = 100000.0;
                System.out.println(name + " " + balance);
            }

        };
        System.out.println(" ");
        account.acc_Details("Meg", 100000.0);
        account.acc_Inn_display();
        System.out.println(" ");
        BankA.Customer customer = bankA.new Customer() {
        };
        customer.inn_cus_details();
    }
}
