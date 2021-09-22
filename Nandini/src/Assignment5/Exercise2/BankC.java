package Assignment5.Exercise2;

public class BankC extends Bank {

    @Override
    double getBalance() {
        // TODO Auto-generated method stub
        char c = '$';
        double amount = 200;
        System.out.println("Deposited Amount for BankC is $"+amount);
        return c+amount;
    }
}
