package com.company.vehicles;

public class Lorry extends Car {
    @Override
    public String toString() { return super.toString(); }


    public Lorry(String model, String classCar, int weight) {
        super(model, classCar, weight);
    }
}
