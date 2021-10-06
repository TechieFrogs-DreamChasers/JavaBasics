package AbstractClassAssignmt;

public abstract class Bank {
    public abstract double getBalance();
}
class BankA extends Bank{
    double amount = 100;
    public double getBalance(){
        return amount;
    }
}

class BankB extends Bank{
    double amount = 150;
    public double getBalance(){
        return amount;
    }
}

class BankC extends Bank{
    double amount = 200;
    public double getBalance(){
        return amount;
    }
}

class DemoBank{
    public static void main(String[] args){
        BankA banka = new BankA();
        BankB bankb = new BankB();
        BankC bankc = new BankC();

        System.out.println(banka.getBalance());
        System.out.println(bankb.getBalance());
        System.out.println(bankc.getBalance());
    }
}
