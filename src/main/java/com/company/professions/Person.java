package com.company.professions;

import com.company.vehicles.Car;

import java.util.Objects;

public class Person extends Car {

    int age;
    String fullName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        if (!super.equals(o)) return false;
        Person person = (Person) o;
        return age == person.age && fullName.equals(person.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), age, fullName);
    }


    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setAge(int age) { this.age = age; }
    public int getAge() { return age; }
    public String getFullName() { return fullName; }

    @Override
    public String toString() {
        return "Person{" + "Возраст: " + age + ", ФИО: '" + fullName + '\'' + '}';
    }

}