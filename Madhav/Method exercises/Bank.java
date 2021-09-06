public class Bank {

    public int getBalance()
    {
        return 0;
    }
    
    public static void main(String[] args) {
        BankA A = new BankA();
        System.out.println(A.getBalance());
        BankB B = new BankB();
        System.out.println(B.getBalance());
        BankC C = new BankC();
        System.out.println(C.getBalance());

    }
    
}
class BankA{
    public int getBalance()
    {
        return 1000;
    }
}
class BankB{
    public int getBalance()
    {
        return 1500;
    }
}
class BankC{
    public int getBalance()
    {
        return 2000;
    }
}
