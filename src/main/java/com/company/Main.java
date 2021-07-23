package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.professions.Person;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

            Person person = new Person(55,"\"Petrov Petr Petrovich\"");

            Driver driver = new Driver(45,"\"Ivan i io\"",15);

            Car car = new Car();
            car.setMarka("Toyota");
            car.setClassCar("B");
            car.setWeight(1500);

            Engine engine = new Engine(1450,"Toyota");
            Lorry lorry= new Lorry(212);
            SportCar sportCar = new SportCar(250);

            out.println(car);
            out.println(driver);
            out.println(person);
            System.out.println(engine);
            out.println(lorry);
            out.println(sportCar);
        }
    }

