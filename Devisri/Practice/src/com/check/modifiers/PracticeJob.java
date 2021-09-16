package com.check.modifiers;

public class PracticeJob {
    private String job_Name;
    public String name;
    public int id;
    private double salary;
    int experience;
    String email;
    private long phone;

    PracticeJob(String job_Name, double salary, long phone) {

        this.job_Name = job_Name;
        this.salary = salary;
        this.phone = phone;
    }

    public PracticeJob(String name, int id, int experience, String email) {
        this("Tester",name,id,65000.0,experience,email,9874563210L);
        this.name = name;
        this.id = id;
        this.experience = experience;
        this.email = email;
    }

    private PracticeJob(String job_Name, String name, int id, double salary, int experience, String email, long phone) {
        this.job_Name = job_Name;
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.experience = experience;
        this.email = email;
        this.phone = phone;
    }

    public static void main(String[] args) {
        PracticeJob pj1 = new PracticeJob("Developer",65000.0,7894563210L);
        pj1.jobPrivateDetails();

        PracticeJob pj2=new PracticeJob("Ginni",4587,5,"ginni@email.com");
        pj2.jobDetails();

        PracticeJob pj3=new PracticeJob("Team-lead","George",5623,90000.0,6,"george@email.com",8976541230L);
        pj3.jobDisplay();
        pj3.jobDetails();
        pj3.jobPrivateDetails();
        System.out.println("**************************");
        PracticeEmployee pe1=new PracticeEmployee();
        pe1.name="Fiona";
        pe1.email="fiona@email.com";
        pe1.id=2589;
        pe1.salary_limit=80000;
        pe1.display();

    }

    void jobDisplay() {
        System.out.println(job_Name + " " + name + " " + id + " " + salary + " " + experience + " " + email + " " + phone);
    }

    private void jobDetails() {
        System.out.println(name + " " + id + " " + experience + " " + email);
    }

    public void jobPrivateDetails() {
        System.out.println(job_Name + " " + salary + " " + phone);
    }

}
