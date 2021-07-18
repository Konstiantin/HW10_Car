package com.company.details;

import java.util.Objects;

public class Engine {

    int Power;
    String Company;

    @Override
    public String toString() {
        return "Engine{" + "Мощьность: " + Power + ", Производитель: '" + Company + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;
        Engine engine = (Engine) o;
        return Power == engine.Power && Company.equals(engine.Company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Power, Company);
    }
}