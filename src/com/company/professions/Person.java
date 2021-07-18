package com.company.professions;

import java.util.Objects;

public class Person {

    int age;
    String fullName;

    @Override
    public String toString() {
        return "Person{" + "Возраст: " + age + ", ФИО: '" + fullName + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && fullName.equals(person.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, fullName);
    }
}