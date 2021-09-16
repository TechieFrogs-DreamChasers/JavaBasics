package polymorphism;

class Bank {
    double getBalance(){
        return 0.0;
    }
}
    class BankA extends Bank{
        double getBalance(){
            return 1000.0;
        }
    }
    class BankB extends Bank{
        double getBalance(){
            return 1500.0D;
        }
    }
    class BankC extends Bank{
        double getBalance(){
            return 2000.0D;
        }
    }
    public class BankMain{
    
    public static void main(String[]args){
        BankA a = new BankA();
        System.out.println(a.getBalance());
        BankB b = new BankB();
        System.out.println(b.getBalance());
        BankC c = new BankC();
        System.out.println(c.getBalance());
    }
}
