package Abtraction;

public abstract class Bank1 {

    int balence;

    abstract void getbalence();

    Bank1( int newbalence){
        this.balence=newbalence;

    }

    
}
class bankA extends Bank1{

    int balance;
    bankA(int newbalence) {
        super(newbalence);
        this.balance=newbalence;
    }

    @Override
    void getbalence() {
       System.out.println(balance);
    }

    
    public static void main(String[] args) {
        bankA oBankA=new bankA(10000);
       
        oBankA.getbalence();
        BankB oBankB =new BankB(20000);
        oBankB. getbalence();
        Bankc oBankc =new Bankc(30000);
        oBankc.getbalence();

    }
    
}

class BankB extends Bank1{

    

    BankB(int newbalence) {
        super(newbalence);
        balence=newbalence;
    }

    @Override
    void getbalence() {
        System.out.println(balence);
        
    }


}

 class Bankc extends Bank1{
      
    void getbalence(){
        System.out.println(balence);

    }

    Bankc(int newbalence) {
        super(newbalence);
        this.balence=newbalence;
    } 
     

}
