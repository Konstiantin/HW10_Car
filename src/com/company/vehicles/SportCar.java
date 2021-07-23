package com.company.vehicles;

import java.util.Objects;

public class SportCar extends Car {

    int Speed;

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        this.Speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + Speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SportCar)) return false;
        if (!super.equals(o)) return false;
        SportCar sportCar = (SportCar) o;
        return Speed == sportCar.Speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Speed);
    }

}