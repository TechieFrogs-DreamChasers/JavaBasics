package com.Practice.InnerClasses;

public class Person {
    private static int id;
    private String name;
    private long phone;

    private Person() {
        System.out.println("Main class-->Person()");
        id=1234;
        name="Tom";
        phone=9874560123L;
    }

  public Person(String name, long phone) {
        System.out.println("Main class-->Person   (parameters)");
        this.name = name;
        this.phone = phone;
    }

    void out_display(){
        System.out.println("Main class-->out_display()");
        System.out.println(id+" "+name+" "+phone);
        //modifier,static are not allowed here
         class Job{
           private static String job_name;
           private double salary;
            public Job() {
                System.out.println("Main class-->out_display()-->Job class-->Job()");
                 job_name="Boss";
                 salary=500000.0;
             }
             void job_details(){
                 System.out.println("Main class-->out_display()-->Job class-->job_details");
                System.out.println(job_name+" "+salary);
                //Job job= new Job(); run-time error if its static method
                //System.out.println(job_name+" "+job.salary);
            }
         }
         Job job=new Job();
         job.job_details();
    }
        private static class AnotherPerson{
            private static int id;
            private static String name;
            private long phone;

            public AnotherPerson() {
                System.out.println("Main class-->static AnotherPerson class-->AnotherPerson()");
                id=4567;
                name="Saul";
                phone=7896541023L;
            }
            static void inn_display(){
                System.out.println("Main class-->static AnotherPerson class-->inn_display()");
                System.out.println(id+" "+name);
                AnotherPerson ap=new AnotherPerson();
                System.out.println(ap.phone);
                //System.out.println(Person.id);//can access directly
                //same modifiers,static are not allowed
                 class Job{
                     private static String job_name;
                     private double salary;
                     public Job() {
                         System.out.println("Main class-->AnotherPerson static class-->inn_display()-->Job class-->Job()");
                         job_name="Assistant";
                         salary=60000.0;
                     }
                     void inn_job_details(){
                         System.out.println("Main class-->AnotherPerson static class-->inn_display()-->Job class-->inn_job_details()");
                         System.out.println(job_name+" "+salary);
                     }
                }
                Job job=new Job();
                 job.inn_job_details();
            }

            public static void main(String[] args) {
                AnotherPerson anotherPerson=new AnotherPerson();
                AnotherPerson.inn_display();
                System.out.println("*********************");
                Person p1=new Person();
                p1.out_display();
            }
        }
    public static void main(String[] args) {
        Person person=new Person();
        person.out_display();
        System.out.println("*************************");
        AnotherPerson ap=new AnotherPerson();
        AnotherPerson.inn_display();
    }
}
