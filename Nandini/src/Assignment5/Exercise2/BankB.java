package Assignment5.Exercise2;

public class BankB extends Bank {

    @Override
    double getBalance() {
        // TODO Auto-generated method stub
        char c = '$';
        double amount = 150;
        System.out.println("Deposited Amount for BankB is $"+amount);
        return c+amount;
    }
    
}
