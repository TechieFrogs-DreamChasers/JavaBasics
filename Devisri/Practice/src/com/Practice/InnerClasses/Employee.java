package com.Practice.InnerClasses;
/*
Non-Static Nested Class:
1) Without existing outer class obj there is no chance of existing non-static inner class obj.
   It's always associated with outer class obj.
2) Inside non-static nested class we cannot declare static members.
3) Inside non-static nested class we cannot have main().
4) From inner non-static class we can only access normal & static members of outer class directly.
 */
public class Employee {
    private String company;
    private int id;
    private String name;
    private static long phone;
    private static String email;

    public Employee() {
        this("StartUp",12,"Dino");
        System.out.println("****Outer class default constructor****");
        Employee.email="dino@email.com";
        Employee.phone=8521470369L;
       // outDisplay();
    }

    public Employee(String company, int id, String name) {
        System.out.println("***Outer Class Parameter Constructor***");
        this.company = company;
        this.id = id;
        this.name = name;
    }

    void outDisplay(){
        System.out.println("***Outer class non-static outDisplay()***");
        System.out.println(company+" "+id+" "+name+" "+Employee.phone+" "+Employee.email);
    }

    static void outDetails(){
        System.out.println("***Outer class static outDetails()***");
        Employee em=new Employee("Tech",00025,"Sam");
        phone=2587413690L;
        email="sam@email.com";
        em.outDisplay();
    }

    private class BonusEmployee{
        private static double salary;
        private int bonus;
        private boolean isEligible;

        public BonusEmployee(int bonus, boolean isEligible) {
            System.out.println("***Inner Class Parameter Constructor***");
            this.bonus = bonus;
            this.isEligible = isEligible;
            BonusEmployee.salary=25000.0;
        }
        void nInDetails(){
            System.out.println("****Inner Class -> non-static nInDetails()****");
            Employee.outDetails();
            Employee em=new Employee();
            em.outDisplay();
            System.out.println(BonusEmployee.salary+" "+bonus+" "+isEligible);
        }
        private static class Profit{
            static int gain;
            int loss;

            public Profit(int loss) {
                System.out.println("***Non-Static Inner Class-> Static Inner Class Constructor***");
                this.loss = loss;
                Profit.gain=5;
            }
            void pInnDisplay(){
                Profit p1=new Profit(15);
                Profit.gain=20;
                System.out.println(Profit.gain+" "+p1.loss);
            }
            //static void pInnDetails(){}allowing

            public static void main(String[] args) {
                Employee employee1=new Employee();
                employee1.outDisplay();
                //BonusEmployee be=new BonusEmployee(5,true); not allowing
                Employee.BonusEmployee be=employee1.new BonusEmployee(10,true);
                be.nInDetails();
                Profit profit=new Profit(5);
                profit.pInnDisplay();

            }

        }
    }

    public static void main(String[] args) {
        Employee.outDetails();
        Employee employee=new Employee();
        employee.outDisplay();
        Employee.BonusEmployee be1=employee.new BonusEmployee(10,true);
        be1.nInDetails();
       // BonusEmployee.Profit p2=be1.new Profit(5); not allowing
    }
}
