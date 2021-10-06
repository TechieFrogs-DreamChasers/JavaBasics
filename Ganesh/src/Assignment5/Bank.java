package Assignment5;

public abstract class Bank {
    abstract void getBalance();

    public static void main(String[] args) {
        BankA a = new BankA();
        a.getBalance();
        BankB b = new BankB();
        b.getBalance();
        BankC c = new BankC();
        c.getBalance();
    }

}
class BankA {
    void getBalance(){
        System.out.println("Balance in Bank A : 100$");
    }
}

class BankB {
    void getBalance(){
        System.out.println("Balance in Bank B : 150$");
    }
}

class BankC {
    void getBalance(){
        System.out.println("Balance in Bank C : 200$");
    }
}