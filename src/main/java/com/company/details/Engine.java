package com.company.details;

import java.util.Objects;

public class Engine {

    private int Power;
    private String Company;

    public Engine(int power, String company) {
        Power = power;
        Company = company;
    }

    public Engine() {
    }

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

    public void setCompany(String company) {
        Company = company;
    }

    public String getCompany() {
        return Company;
    }

    public int getPower() {
        return Power;
    }

    public Engine(String company) {
        Company = company;
    }

    public Engine(int power) {
        Power = power;
    }

    public void setPower(int power) {
        Power = power;
    }

    @Override
    public String toString() {
        return "Engine{" + "Power=" + Power + ", Company='" + Company + '\'' + '}';
    }
}
