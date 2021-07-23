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

import com.company.details.Engine;
import com.company.professions.Driver;

import java.util.Objects;

public class Car {

    private String marka;
    private String classCar;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car() {

    }

    @Override
    public String toString() {
        return "Car{" + "marka='" + marka + '\'' + ", classCar='" + classCar + '\''
                + ", weight=" + weight + ", driver=" + driver + ", engine=" + engine+ '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return weight == car.weight && marka.equals(car.marka) && classCar.equals(car.classCar) && driver.equals(car.driver)
                && engine.equals(car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, classCar, weight, driver, engine);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getClassCar() {
        return classCar;
    }

    public void setClassCar(String classCar) {
        this.classCar = classCar;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver() { this.driver = driver; }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine() {
        this.engine = engine;
    }

    public Car(String marka, String classCar, int weight, Driver driver, Engine engine) {
        this.marka = marka;
        this.classCar = classCar;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public  void start() {System.out.println("Поехали!!!");}

    public  void stop() {
        System.out.println("Останавливаемся!!!");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void printInfo() { System.out.println("Car model " + getMarka() + "\n" + getClassCar() + "\n" + getWeight() +
            "\n"+ driver+"\n"+ engine);}
}






