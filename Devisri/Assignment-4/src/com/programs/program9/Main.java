package com.programs.program9;

public class Main {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        Customer ramu = new Customer("Ramu", 23589, 7854903126L,
                "ramu@email.com");
        ramu.cust_Details();
        System.out.println("SBI Minimum Interest Rate: " + sbi.getMi_int_Rate() +
                " SBI Maximum Interest Rate: " + sbi.getMa_int_Rate() +
                " SBI Minimum Balance: " + sbi.getMin_Balance() +
                " SBI Maximum withdrawal limit: " + sbi.getMax_with_limit());
        Account ramu_acc = new Account("0000058647", 100000.0, 10000,
                25000.0, sbi.getMa_int_Rate(), sbi.getMi_int_Rate());
        ramu_acc.acc_Details();
        ICCI icci = new ICCI();
        Customer madhu = new Customer("Madhu", 58974, 8520164973L,
                "madhu@email.com");
        madhu.cust_Details();
        System.out.println("ICCI Minimum Interest Rate: " + icci.getMi_int_Rate() +
                " ICCI Maximum Interest Rate: " + icci.getMa_int_Rate() +
                " ICCI Minimum Balance: " + icci.getMin_Balance() +
                " ICCI Maximum withdrawal limit: " + icci.getMax_with_limit());
        Account madhu_acc = new Account("0000015826", 200000.0, 50000,
                15000.0, icci.getMa_int_Rate(), icci.getMi_int_Rate());
        madhu_acc.acc_Details();
        HDFC hdfc = new HDFC();
        Customer vani = new Customer("Vani", 91256, 9856740132L,
                "vani@email.com");
        vani.cust_Details();
        System.out.println("HDFC Minimum Interest Rate: " + hdfc.getMi_int_Rate() +
                " HDFC Maximum Interest Rate: " + hdfc.getMa_int_Rate() +
                " HDFC Minimum Balance: " + hdfc.getMin_Balance() +
                " HDFC Maximum withdrawal limit: " + hdfc.getMax_with_limit());
        Account vani_acc = new Account("00000856972", 300000.0, 100000,
                5000.0, hdfc.getMa_int_Rate(), hdfc.getMi_int_Rate());
        vani_acc.acc_Details();
        /*
OutPut:
Ramu  23589  ramu@email.com  7854903126
SBI Minimum Interest Rate: 2.0 SBI Maximum Interest Rate: 5.0
SBI Minimum Balance: 100.0 SBI Maximum withdrawal limit: 100000.0
Account Number: 0000058647
Fixed Deposit: 100000.0
Balance after Fixed period: 105000.0
Premature Withdrawal Balance: 98000.0
Madhu  58974  madhu@email.com  8520164973
ICCI Minimum Interest Rate: 4.0 ICCI Maximum Interest Rate: 8.0
ICCI Minimum Balance: 500.0 ICCI Maximum withdrawal limit: 100000.0
Account Number: 0000015826
Fixed Deposit: 200000.0
Balance after Fixed period: 216000.0
Premature Withdrawal Balance: 192000.0
Vani  91256  vani@email.com  9856740132
HDFC Minimum Interest Rate: 3.0 HDFC Maximum Interest Rate: 9.0
HDFC Minimum Balance: 500.0 HDFC Maximum withdrawal limit: 100000.0
Account Number: 00000856972
Fixed Deposit: 300000.0
Balance after Fixed period: 327000.0
Premature Withdrawal Balance: 291000.0

 */


    }
}
