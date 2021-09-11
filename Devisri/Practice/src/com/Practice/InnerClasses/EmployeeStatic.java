package com.Practice.InnerClasses;
/*
Static Nested Class:
1) Without existing outer class obj there maybe a chance of existing static inner class obj.
   It's not associated with outer class obj.
2) Inside static nested class we can declare static members.
3) Inside static nested class we can have main(). We can invoke objects from here also.
4) From inner static class we can only access static members of outer class
 */
public class EmployeeStatic {//step1-> Outer class-> variables=static+instance
    private static String company;
    private static int id;
    private static String name;
    private long phone;
    private String email;

    public EmployeeStatic() {//Outer class constructor
        this(7894561230L,"bill@email.com");
        System.out.println("*****Outer Class -> Default constructor*****");
        EmployeeStatic.company="StartUp";
        EmployeeStatic.id=0001;
        EmployeeStatic.name="Bill";
    }

    public EmployeeStatic(long phone, String email) {//outer class parameter constructor
        this.phone = phone;
        this.email = email;
    }
    static void display(){//outer class static method
        //created obj to access non-static variables in static method
        EmployeeStatic es=new EmployeeStatic(1238547960L,"carly@email.com");
        company="Techno";
        id=00012;
        name="Carly";
        System.out.println("****Outer Class -> static display()****");
        System.out.println(company+" "+id+" "+name+" "+es.phone+" "+es.email);
    }

    void details(){//outer class non static method
        System.out.println("****Outer Class -> Non-static details()****");
        System.out.println(EmployeeStatic.company+" "+EmployeeStatic.id+" "+EmployeeStatic.name+" "+phone+" "+email);
        //EmployeeBonus.Profit profit=new Profit(5);//not allowing. Maybe if we create Employee bonus obj
    }

    private static class EmployeeBonus{//Step2 -> inner static class
        //inner class variables=static+instance
        private double salary;
        private static int bonus;
        private static boolean isEligible;

        public EmployeeBonus(double salary) {
            this.salary = salary;
        }

        public EmployeeBonus() {
            this(50000.0);
            System.out.println("*****Inner Static class -> default constructor*****");
            Profit p=new Profit(5);//Inner class inside another non-static class Profit access.
            p.profitDisplay();//Profit class method access with its obj.
        }
        static void innDisplay(){//static inner class method
            System.out.println("****Inner Class -> static nonDisplay()****");
            EmployeeBonus eb=new EmployeeBonus(20000);
            bonus=10;
            isEligible=true;
            System.out.println(company+" "+id+" "+name);
            display();
            System.out.println(eb.salary+" "+bonus+"% "+isEligible);
            //Profit p=new Profit(5); not allowing
        }

        void innDetails(){//inner class non-static method
            EmployeeStatic.display();//outer class Static method
            EmployeeBonus.innDisplay();//inner class non-static method
            Profit p1=new Profit(5);//this class's inner class profit access
            p1.profitDisplay();//calling profit class non-static method
        }

        private class Profit {//Step3 -> creating non-static class inside static class
            //public static void main(String[] args) {}not accepting
            //variables=static+non-static
            static int gain;
            int loss;

            public Profit(int loss) {//Constructor
                this.loss = loss;
                Profit.gain=5;
                profitDisplay();
            }

            void profitDisplay(){//non-static method
                System.out.println("*** Inside static inner class Non static Profit class ***");
                System.out.println(Profit.gain+" "+loss);
                EmployeeStatic.EmployeeBonus.innDisplay();//static method
                EmployeeBonus eb4=new EmployeeBonus();
                eb4.innDetails();//innerclass non-static
            }

        }
        public static void main(String[] args) {//inner class main
            EmployeeStatic es2=new EmployeeStatic(2589631470L,"john@email.com");
            EmployeeStatic.name="John";
            EmployeeStatic.company="Wire";
            EmployeeStatic.id=13;
            es2.details();
            System.out.println("************");
            EmployeeBonus eb1=new EmployeeBonus();
            eb1.innDetails();
            System.out.println("************");
            EmployeeBonus.Profit profit=eb1.new Profit(10); //allowing
            profit.profitDisplay();
        }

    }

    public static void main(String[] args) {//outer main
        EmployeeStatic.display();
        EmployeeStatic es1=new EmployeeStatic();
        es1.details();
        System.out.println("**************************");
        EmployeeBonus.innDisplay();
        EmployeeBonus eb2=new EmployeeBonus(50000.0);
        eb2.innDetails();
        System.out.println("************");
        EmployeeBonus.Profit profit=eb2.new Profit(10); //allowing
        profit.profitDisplay();


    }
}
