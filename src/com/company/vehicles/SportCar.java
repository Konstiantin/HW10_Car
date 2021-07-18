package com.company.vehicles;

import java.util.Objects;

public class SportCar extends Car{
    int carrying;

    @Override
    public String toString() {
        return "SportCar{" +
                "carrying=" + carrying +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SportCar)) return false;
        SportCar sportCar = (SportCar) o;
        return carrying == sportCar.carrying;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carrying);
    }

    public SportCar(String model, String classCar, int weight) {
        super(model, classCar, weight);
    }

}
