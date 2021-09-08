//package Practice.src;

public class BankAccount {
    static final String ERR_MSG = "Insufficient Balance!!!";
    String customer_Name;
    String acc_Num;
    double balance;
    String email;
    long phone;

    public BankAccount() {
        this("Sam", "0000005284176390", 15000.76, "sam@email.com", 8521479630L);
        System.out.println("***Default Constructor called***");
    }

    public BankAccount(String customer_Name, String acc_Num, double balance, String email, long phone) {
        this.customer_Name = customer_Name;
        this.acc_Num = acc_Num;
        this.balance = balance;
        this.email = email;
        this.phone = phone;
    }

    public static void main(String[] args) {
        BankAccount john = new BankAccount("John", "0000002598763145", 25000.0, "john@email.com", 7894561230L);
        System.out.println("****Before transactions****");
        john.display();
        john.deposit(5000.0);
        john.withdraw(10000.0);
        System.out.println("****After transactions****");
        john.display();

        BankAccount sam = new BankAccount();
        System.out.println("****Before transactions****");
        sam.display();
        sam.deposit(5000.0);
        sam.withdraw(10000.0);
        System.out.println("****After transactions****");
        sam.display();
    }

    void deposit(double deposit) {
        balance += deposit;
        System.out.println("A deposit of " + deposit + " is made." + "New balance after deposit is: " + balance);
    }

    void withdraw(double withdraw) {
        if (withdraw > balance) {
            System.out.println(ERR_MSG + " You have only: " + balance);

        } else {
            balance -= withdraw;
            System.out.println(
                    "A withdrawal of " + withdraw + " is made. " + "New balance after withdrawal is: " + balance);
        }
    }

    void display() {
        System.out.println(customer_Name + " " + acc_Num + " " + balance + " " + email + " " + phone);
    }
}
