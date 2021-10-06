package Methods;

public class Bank {

    int getBalance(){
        return 0;
    }

    public static void main(String[] args) {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();

        System.out.println("The amount deposited in this BankA is $"+" "+a.getBalance());
        System.out.println("The amount deposited in this BankB is $"+" "+b.getBalance());
        System.out.println("The amount deposited in this BankC is $"+" "+c.getBalance());
    }
    
}

class BankA{

    int getBalance(){

        return 1000;
    }
}


class BankB{

    int getBalance(){
        return 1500;
    }
}

class BankC{

    int getBalance(){
        return 2000;
    }
}

