package com.company.professions;

import java.util.Objects;

public class Driver extends Person{

    public int experience;


    public void setExperience(int experience) { this.experience = experience; }
    public int getExperience() { return experience; }


    @Override
    public String toString() { return "Driver{" + "Стаж вождения: " + experience + '}'; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        if (!super.equals(o)) return false;
        Driver driver = (Driver) o;
        return experience == driver.experience;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experience);
    }
}
