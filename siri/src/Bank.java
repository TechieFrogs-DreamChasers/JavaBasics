public class Bank {
    int getbalence(){
        return 0;

    }
    
}
class bankA{
    int getbalence(){
       return 1000;

    }

}
class bankB{
    int getbalence(){
        return 1500;

    }

}
class bankC{
    int getbalence(){
        return 2000;

    }


public static void main(String[] args) {
    Bank oBank=new Bank();
    oBank.getbalence();
    System.out.println("getbalence is :" + oBank.getbalence() );
    bankA oA=new bankA();
    oA.getbalence();
    System.out.println("getbalence is :" + oA.getbalence() );
    bankB oB=new bankB();
    oB.getbalence();
    System.out.println("getbalence is :" + oB.getbalence() );
    bankC oC =new bankC();
    oC.getbalence();
    System.out.println("getbalence is :" + oC.getbalence() );
    
}
}


