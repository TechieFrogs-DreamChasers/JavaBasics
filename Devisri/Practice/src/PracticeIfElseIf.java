public class PracticeIfElseIf {
    public static final String ERR_WARNING="Your Account Balance Insufficient";
    public static final String ERR_MSG="You have Zero Balance";
    public static void main(String[] args) {
        double balance=15000.0;
        double withdrawl=5000.0;
        double deposit=3000.0;

        if(balance > withdrawl){
            balance=balance-withdrawl;
            System.out.println("Your balance after withdrawal is: "+balance);
        } else if(balance < withdrawl){
            System.out.println(ERR_WARNING);
        } else {
            System.out.println(ERR_MSG);
        }

        if(balance>=0){
            balance=balance+deposit;
            System.out.println("Your balance after deposit is: "+balance);
        }

    }
}
