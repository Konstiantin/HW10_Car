package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

import java.util.Objects;

public class SportCar extends Car {

    private int speed ;

    public SportCar (String marka,String classCar, int weight,Driver driver,Engine engine,int speed) {
        super (marka,classCar,weight,driver,engine);
        this.speed = speed;

    }
    protected int getSpeed() {
        return speed;
    }

    protected void setSpeed(int speed) {
        this.speed = speed;
    }

    public SportCar(int speed,String marka,String classCar,int weight,Driver driver,Engine engine) {
        super(speed,marka,classCar,weight,driver,engine);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" + "speed=" + speed + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SportCar)) return false;
        if (!super.equals(o)) return false;
        SportCar sportCar = (SportCar) o;
        return speed == sportCar.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed);
    }

}