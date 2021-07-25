package com.company.professions;

import java.util.Objects;

public class Person {

    protected int Age;
    protected String FullName;

    public Person(int age, String fullName) {
        Age = age;
        FullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        if (!super.equals(o)) return false;
        Person person = (Person) o;
        return Age == person.Age && FullName.equals(person.FullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Age, FullName);
    }


    public void setFullName(String fullName) { this.FullName = fullName; }
    public void setAge(int age) { this.Age = age; }
    public int getAge() { return Age; }
    public String getFullName() { return FullName; }

    @Override
    public String toString() {
        return "Person{" + "Возраст: " + Age + ", ФИО: '" + FullName + '\'' + '}';
    }

}