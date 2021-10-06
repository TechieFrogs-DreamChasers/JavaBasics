package com.Practice.InnerClasses.Session;
// Outer class ---> Local class ---> Inner Class
public class Banks {
    //outer class variables static + final
    static double balance;
    static final double WITHDRAWAL_LIMIT=100000.0;
    //Outer class constructor
    public Banks() {
        System.out.println("Outer Class Banks ---> Banks() ---> called!!!");
        Banks.balance=50000.0D;
    }
    //Outer class instance method
    void bank_Account_Details(){
        //Body of this instance method
        System.out.println("Outer Class Banks ---> bank_Account_Details() ---> called!!!");
        //local variable which are initialized
        //local variable can't be static
        double dep_Amount = 15000.0;
        double with_Amount = 25000.0;
        //Local class
        //No modifiers + static keyword
        //can be abstract
        class Withdrawal{
            //Local class constructor
            Withdrawal(){
                System.out.println("Inside Instance method ---> Local class ---> Withdrawal() called!!!");
            }
            //Local class instance method
             void with_draw(){
                System.out.println("Inside Instance Method ---> Local class ---> Withdrawal class ---> with_draw()");
                System.out.println("Withdrawal limit being: "+WITHDRAWAL_LIMIT+", Amount Withdrawn: "+with_Amount+" is in limit.");
            }
        }
        //Another Local class
        class Deposit{
            //Its Constructor
            Deposit(){
                System.out.println("Inside Instance method ---> Local class ---> Deposit() called!!!");
            }
            //Its Instance Method
            void deposits(){
                System.out.println("Inside Instance Method ---> Local class ---> Deposit class ---> deposits()");
                System.out.println("Deposited: "+dep_Amount);
            }
        }
        //Local classes must be instantiated inside the method block
        //Because these are also local to the method as its variables
        Withdrawal withdrawal=new Withdrawal();
        withdrawal.with_draw();
        Deposit deposit=new Deposit();
        deposit.deposits();
    }
    //Inner Class
    class Timings{
        //Inner Class static variables
        static String open_time;
        static String close_time;
        //Inner Class Constructor
        public Timings() {
            System.out.println("Inner Class ---> Timings ---> Timings() called");
            Timings.open_time="10:00 AM";
            Timings.close_time="6:00 PM";
        }
        //Inner Class Static Method
       static void timings_Show(){
            //Method body
           System.out.println("Inner Class ---> Timings ---> timings_Show() called");
           //Local class
            class TransactionTime{
                //Local class Constructor
                TransactionTime(){
                    System.out.println("Inner Class ---> Timings ---> Local class ---> TransactionTime() called");
                }
                //Local class Instance Method
                void timings(){
                    //Method Body
                    System.out.println("Inner Class ---> Timings ---> Local class ---> timings() called");
                    //Deep Local class
                    class Timing{
                        //Deep Local class constructor
                        Timing(){
                            System.out.println("Deep Local class ---> Timing() called");
                        }
                        //Deep Local class Instance Method
                        void details(){
                            System.out.println("Transactions are allowed in Morning");
                        }
                    }
                    //As this is a Deep Inner class Object has to be instantiated
                    Timing timing=new Timing();
                    timing.details();
                    System.out.println("Transactions are not allowed from Afternoon");
                }
            }
            //Inner class static method's Local class is instantiated
           //I wanted to instantiate it only once
           //Anonymous class way is more viable option in these scenarios
           TransactionTime tt=new TransactionTime(){
                 String type="Withdrawal";
                 double amount=5000.0d;
                @Override
                void timings() {
                    super.timings();
                    t_Details();
                }
                  void t_Details(){
                    System.out.println("Transaction of Type: "+type+" ,Amount: "+amount);
                }
            };
            tt.timings();
        }
    }

    public static void main(String[] args) {
        Banks banks=new Banks();
        banks.bank_Account_Details();
        //Banks.Timings.timings_Show();
        //Banks.Timings t=banks.new Timings();
        Timings.timings_Show();

    }

}
