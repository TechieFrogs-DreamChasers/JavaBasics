package Methods.Nineth;

public class Main {

    public static void main(String[] args) {
        SBI sbi = new SBI();
        Customer bharath = new Customer("bharath", 23589, 7854903126L,
                "bharath@email.com");
        bharath.cust_Details();
        System.out.println("SBI Minimum Interest Rate: " + sbi.getMi_int_Rate() +
                " SBI Maximum Interest Rate: " + sbi.getMa_int_Rate() +
                " SBI Minimum Balance: " + sbi.getMin_Balance() +
                " SBI Maximum withdrawal limit: " + sbi.getMax_with_limit());
        Account bharath_acc = new Account("0000058647", 100000.0, 10000,
                25000.0, sbi.getMa_int_Rate(), sbi.getMi_int_Rate());
        bharath_acc.acc_Details();


        ICICI icici = new ICICI();
        Customer peter = new Customer("peter", 58974, 8520164973L,
                "peter@email.com");
        peter.cust_Details();
        System.out.println("ICCI Minimum Interest Rate: " + icici.getMi_int_Rate() +
                " ICCI Maximum Interest Rate: " + icici.getMa_int_Rate() +
                " ICCI Minimum Balance: " + icici.getMin_Balance() +
                " ICCI Maximum withdrawal limit: " + icici.getMax_with_limit());
        Account peter_acc = new Account("0000015826", 200000.0, 50000,
                15000.0, icici.getMa_int_Rate(), icici.getMi_int_Rate());
        peter_acc.acc_Details();


        HDFC hdfc = new HDFC();
        Customer ram = new Customer("ram", 91256, 9856740132L,
                "ram@email.com");
        ram.cust_Details();
        System.out.println("HDFC Minimum Interest Rate: " + hdfc.getMi_int_Rate() +
                " HDFC Maximum Interest Rate: " + hdfc.getMa_int_Rate() +
                " HDFC Minimum Balance: " + hdfc.getMin_Balance() +
                " HDFC Maximum withdrawal limit: " + hdfc.getMax_with_limit());
        Account ram_acc = new Account("00000856972", 300000.0, 100000,
                5000.0, hdfc.getMa_int_Rate(), hdfc.getMi_int_Rate());
        ram_acc.acc_Details();
    
}
}
