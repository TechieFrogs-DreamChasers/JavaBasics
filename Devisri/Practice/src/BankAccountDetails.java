//package Practice.src;

public class BankAccountDetails {
    String name;
    long acc_Number;
    double balance;
    boolean valid;

    BankAccountDetails() {
        System.out.println("****Default Constructor****");
        name = "Jenny";
        acc_Number = 000000021643000L;
        balance = 25000;
        valid = true;
    }

    BankAccountDetails(String name, long acc_Number, double balance) {
        System.out.println("****Three Parameter Constructor****");
        this.name = name;
        this.acc_Number = acc_Number;
        this.balance = balance;
    }

    public BankAccountDetails(String name, long acc_Number, boolean valid) {
        System.out.println("****Three Parameter with different data type Constructor****");
        this.name = name;
        this.acc_Number = acc_Number;
        this.valid = valid;
    }

    BankAccountDetails(String name, long acc_Number, double balance, boolean valid) {
        System.out.println("****Four Parameter Constructor****");
        this.name = name;
        this.acc_Number = acc_Number;
        this.balance = balance;
        this.valid = valid;
    }

    public static void main(String[] args) {
        BankAccountDetails bad = new BankAccountDetails();
        bad.display();
        BankAvailability ba = new BankAvailability("Weekdays", "Main", 25000);
        ba.availability();
        BankAccountDetails bad1 = new BankAccountDetails("John", 123456789L, 50000);
        bad1.display();
        BankAvailability ba1 = new BankAvailability();
        ba1.availability();
        BankAccountDetails bad2 = new BankAccountDetails("Tim", 52314987L, true);
        bad2.display();
        BankAvailability ba2 = new BankAvailability("Main", 50000);
        ba2.availability();
        BankAccountDetails bad3 = new BankAccountDetails("Sara", 62897413L, 62000, true);
        bad3.display();
        BankAvailability ba3 = new BankAvailability("Weekend", "Sub");
        ba3.availability();
    }

    void display() {
        System.out.println(name + " " + acc_Number + " " + balance + " " + valid);
    }
}
