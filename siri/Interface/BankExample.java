public interface BankExample {
    float rateofinterest();

    
}
class SBI1 implements BankExample{
    public float rateofinterest(){
        return (9.7f);

    }
}
class HDFC1 implements BankExample{
    public float rateofinterest(){
        return(9.10f);

    }
}
class TestInterface{
    public static void main(String[] args) {
        BankExample oBankExample=new HDFC1();
        System.out.println(oBankExample.rateofinterest());
    }
}
