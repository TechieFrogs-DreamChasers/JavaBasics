package Assignment4;

public class Bank {
    double getBalance(){
        return 0;
    }
}
class BankA {
    double getBalance(double amount){
        return amount;
    
    }
}
class BankB {
    double getBalance(double amount){
        return amount;
    }
}
class BankC {
    double getBalance(double amount){
        return amount;
    }

    public static void main(String[] args){
        BankA A = new BankA();
        System.out.println("Amount in Bank A :"+A.getBalance(1000)+"$");
    
        BankB B = new BankB();
        System.out.println("Amount in Bank B :"+B.getBalance(1500)+"$");
    
        BankC C = new BankC();
        System.out.println("Amount in Bank C :"+C.getBalance(2000)+"$");
    
    }
}