package com.Practice.Strings;

//toString(),valueOf
public class StringsToOfMethods {

    public static void main(String[] args) {
        int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String string = String.valueOf(value.length);
        System.out.println(string);//10
        System.out.println(string + 10);//1010
        System.out.println(Integer.parseInt(string) + 10);//20
        System.out.println("***ToString()***");
        StringsToOfMethods some = new StringsToOfMethods();
        System.out.println(some.toString());//com.Practice.Strings.StringsToOfMethods@7229724f
        Person p = new Person();
        System.out.println(p);//Voter Info: null  0     false
        Person john = new Person("John", 19, 'm', true);
        Person annie = new Person("Annie", 18, 'f', true);
        Person bob = new Person("Bob", 16, 'm', false);
        System.out.println(john);//Voter Info: John  19  m  true
        System.out.println(annie);//Voter Info: Annie  18  f  true
        System.out.println(bob);//Voter Info: Bob  16  m  false
    }
}

class Person {
    String name;
    int age;
    char gender;
    boolean isEligible;

    Person() {
    }

    public Person(String name, int age, char gender, boolean isEligible) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isEligible = isEligible;
    }

    public static void main(String[] args) {

    }

    public String toString() {
        return "Voter Info: " + name + "  " + age + "  " + gender + "  " + isEligible;
    }
}
