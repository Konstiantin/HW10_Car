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
            Engine engine = new Engine(1450,"Toyota");
            Lorry lorry= new Lorry("marka1_lorry", "carClass1_lorry", 500, driver, engine, 300);
            SportCar sportCar = new SportCar("marka2_sportcar", "carClass2_sportcar", 1500, driver, engine, 100);
       lorry.printInfo();
       sportCar.printInfo();
            
        }
    }

