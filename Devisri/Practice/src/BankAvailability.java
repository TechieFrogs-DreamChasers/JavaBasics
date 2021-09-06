public class BankAvailability {
    String open;
    String branch;
    double limit;


    BankAvailability() {
       // System.out.println("***Default Constructor***");

    }

    public BankAvailability(String open, String branch) {
        this.open = open;
        this.branch = branch;
    }

    public BankAvailability(String branch, double limit) {
        this.branch = branch;
        this.limit = limit;
    }

    public BankAvailability(String open, String branch, double limit) {
        this.open = open;
        this.branch = branch;
        this.limit = limit;

    }

    public static void main(String[] args) {
        BankAccountDetails bad=new BankAccountDetails();
        bad.display();
        BankAvailability ba=new BankAvailability();
        ba.availability();
        BankAvailability ba1=new BankAvailability("Weekends","Sub");
        ba1.availability();
        BankAvailability ba2=new BankAvailability("Main",50000);
        ba2.availability();
        BankAvailability ba3=new BankAvailability("Weekdays","Main",50000);
        ba3.availability();

    }
    void availability(){
        System.out.println("Bank is open on "+open+" and available branch is "+branch+" with withdrawal limit "+limit);
    }
}
