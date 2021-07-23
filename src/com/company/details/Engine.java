package com.company.details;
import com.company.vehicles.Car;

import java.util.Objects;

public class Engine extends Car {

    int Power;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;
        if (!super.equals(o)) return false;
        Engine engine = (Engine) o;
        return Power == engine.Power && Company.equals(engine.Company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Power, Company);
    }

    String Company;

    public void setCompany(String company) {
        Company = company;
    }

    public String getCompany() {
        return Company;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int power) {
        Power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "Power=" + Power +
                ", Company='" + Company + '\'' +
                '}';
    }
}
