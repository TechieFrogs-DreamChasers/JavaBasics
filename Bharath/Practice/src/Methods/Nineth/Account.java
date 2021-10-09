package Methods.Nineth;

public class Account {

    private String acc_Num;
    private double deposit;
    private double withdrawal;
    private double balance;
    private double int_rate;
    private double penality;

    public Account(String acc_Num, double deposit, double withdrawal, double balance, double int_rate, double penality) {
        this.acc_Num = acc_Num;
        this.deposit = deposit;
        this.withdrawal = withdrawal;
        this.balance = balance;
        this.int_rate = int_rate;
        this.penality = penality;
    }

    public String getAcc_Num() {
        return acc_Num;
    }

    public double getDeposit() {
        return fixed_Deposit();
    }

    public double getWithdrawal() {
        return bal_withdrawl_early(penality);
    }

    public double getBalance() {
        return bal_Interest_Rate(int_rate);
    }

    private double fixed_Deposit() {
        return deposit;
    }

    private double bal_Interest_Rate(double int_rate) {
        double amount = deposit + (deposit * int_rate / 100);
        return amount;
    }

    private double bal_withdrawl_early(double penality) {
        double amount = deposit - (deposit * penality / 100);
        return amount;
    }

    public void acc_Details() {
        System.out.println("Account Number: " + getAcc_Num());
        System.out.println("Fixed Deposit: " + getDeposit());
        System.out.println("Balance after Fixed period: " + getBalance());
        System.out.println("Premature Withdrawal Balance: " + getWithdrawal());
    }
    
}
