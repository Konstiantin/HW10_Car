package com.company.vehicles;

import java.util.Objects;

public class Lorry extends Car {

    int carrying;

    public int getCarrying() { return carrying; }
    public void setCarrying(int carrying) { this.carrying = carrying; }


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

    public Lorry() {
        super();
    }
}
