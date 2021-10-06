public abstract class Bank {

    abstract void getbalance(int i);
    
}
class BankA extends Bank{

    void getbalance(int i)
    {
        System.out.println("Bank A have balance of "+i);
    }

}
class BankB extends Bank{

    void getbalance(int i)
    {
        System.out.println("Bank B have balance of "+i);
    }

}
class BankC extends Bank{

    void getbalance(int i)
    {
        System.out.println("Bank C have balance of "+i);
    }

}
class Banks{
    public static void main(String[] args) {
        BankA A = new BankA();
        A.getbalance(100);
        BankB B = new BankB();
        B.getbalance(150);
        BankC  C = new BankC();
        C.getbalance(200);
        
    }
}
