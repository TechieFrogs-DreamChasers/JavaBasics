package com.newPractice.collections.myprograms.maps;

import java.util.Objects;

public final class Person {

    private final String name;
    private final Integer age;
    private final Boolean isWorking;
    private final Integer birthYear;

    public Person(String name, Integer age, Boolean isWorking, Integer birthYear) {
        this.name = name;
        this.age = age;
        this.isWorking = isWorking;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getWorking() {
        return isWorking;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isWorking=" + isWorking +
                ", birthYear=" + birthYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && age.equals(person.age) && isWorking.equals(person.isWorking) && birthYear.equals(person.birthYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isWorking, birthYear);
    }
}
