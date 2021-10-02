package com.Practice.array;

class Voter{
    String name;
    int age;
    boolean isEligible;
    char gender;

    public Voter(String name, int age, boolean isEligible, char gender) {
        this.name = name;
        this.age = age;
        this.isEligible = isEligible;
        this.gender = gender;
    }

    public String toString(){
        return "Voter info:\nName: "+name+"  Age: "+age+"  Eligibility: "+isEligible+"  Gender: "+gender;
    }
}

public class ObjArray {
    public static void main(String[] args) {
        Voter[] voters={new Voter("Anne",25,true,'f'),
                        new Voter("Bran",32,true,'m'),
                        new Voter("Catherine",21,true,'f'),
                        new Voter("Drew",18,true,'m'),
                        new Voter("Ellie",20,true,'f')};
        for (Voter voter:voters) {
            System.out.println(voter);
        }

    }
}
