package Assignment5.Exercise2;

public class BankA extends Bank {

    @Override
    double getBalance() {
        // TODO Auto-generated method stub
        char c = '$';
        double amount = 100;
        System.out.println("Deposited Amount for BankA is $"+amount);
        return c+amount;
    }

}
