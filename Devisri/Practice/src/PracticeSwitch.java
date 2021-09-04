public class PracticeSwitch {
    public static final String MSG1="***Welcome***";
    public static final String MSG2="***Happy Banking***";
    public static final String ERR_MSG="Invalid Entry";
    public static void main(String[] args) {
        String pin="****";
        double balance=25000.686;
        double withdrawl=15000;
        String mini="Printing Your Mini-Statement....";
        int option=6;
        switch (option){
            case 0:
                System.out.println(MSG1);
                break;
            case 1:
                System.out.println("Enter your Pin: "+pin);
                break;
            case 2:
                System.out.println("Your Balance is: "+balance);
                break;
            case 3:
                balance=balance-withdrawl;
                System.out.println("Your balance after withdrawl is: "+balance);
                break;
            case 4:
                System.out.println(mini);
                break;
            case 5:
                System.out.println(MSG2);
                break;
            default:
                System.out.println(ERR_MSG);
        }
    }
}
