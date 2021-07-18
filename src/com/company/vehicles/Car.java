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

import java.util.Objects;

public class Car {

     String modelCar;
     String classCar;
     int weight;

    @Override
    public String toString() {
        return "Car{" +
                "modelCar='" + modelCar + '\'' +
                ", classCar='" + classCar + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return weight == car.weight && modelCar.equals(car.modelCar)
                && classCar.equals(car.classCar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelCar, classCar, weight);
    }

    public Car(String model, String classCar, int weight) {
        this.modelCar = model;
        this.classCar = classCar;
        this.weight= weight;
    }

    public void start() { System.out.println("Поехали!!!"); }
    public void stop()  { System.out.println("Останавливаемся!!!"); }
    public void turnRight()  { System.out.println("Поворот направо"); }
    public void turnLeft()  { System.out.println("Поворот налево"); }
}





