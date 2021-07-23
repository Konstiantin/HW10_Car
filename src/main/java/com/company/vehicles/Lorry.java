package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

import java.util.Objects;

public class Lorry extends Car {

    private int carrying ;

    public Lorry(int carrying) {
        this.carrying = carrying;
    }

    public Lorry(String marka, String classCar, int weight, Driver driver, Engine engine, int carrying) {
        super(marka, classCar, weight, driver, engine);
        this.carrying = carrying;
    }

    public int getCarrying() { return carrying; }
    protected void setCarrying(int carrying) { this.carrying = carrying; }


    @Override
    public String toString() { return "Lorry{" + "carrying=" + carrying + '}'; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lorry)) return false;
        if (!super.equals(o)) return false;
        Lorry lorry = (Lorry) o;
        return carrying == lorry.carrying;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carrying);
    }
}
