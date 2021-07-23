package com.company.vehicles;

//. Класс Car содержит:
//        поля:
//        - марка автомобиля
//        - класс автомобиля,
//        - вес
//        - водитель типа Driver
//        - мотор типа Engine
//        методы:
//        - start() - выводит на печать: "Поехали"
//        - stop() - выводит на печать: "Останавливаемся"
//        - turnRight() - выводит на печать: "Поворот направо"
//        - turnLeft() - выводит на печать: "Поворот налево"

import com.company.professions.Driver;

import java.util.Objects;

public class Car {

    String modelCar;
    String classCar;
    int weight;

    Driver
            Engine;

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public void setClassCar(String classCar) {
        this.classCar = classCar;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setEngine(Driver engine) {
        Engine = engine;
    }

    public String getModelCar() {
        return modelCar;
    }

    public String getClassCar() {
        return classCar;
    }

    public int getWeight() {
        return weight;
    }

    public Driver getEngine() {
        return Engine;
    }

    public Car() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return weight == car.weight && modelCar.equals(car.modelCar) &&
                classCar.equals(car.classCar) && Engine.equals(car.Engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelCar, classCar, weight, Engine);
    }

    @Override
    public String toString() {
        return "Car{" + "modelCar='" + modelCar + '\'' + ", classCar='" + classCar + '\'' +
                ", weight=" + weight + ", Engine=" + Engine + '}';
    }

    public String start() {
        return "Поехали!!!";
    }

    public String stop() {
        return "Останавливаемся!!!";
    }

    public String turnRight() {
        return "Поворот направо";
    }

    public String turnLeft() {
        return "Поворот налево";
    }

    public Object printInfo() {
      return "Car model " + getModelCar()+"\n"+getClassCar()+"\n"+getWeight()+"\n";

    }
}






