package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.professions.Person;

import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;



public class Main {

    public static void main(String[] args) {

            Person person = new Person(55,"\"Petrov Petr Petrovich\"");
            Driver driver = new Driver(45,"\"Ivan i io\"",15);
            Engine engine = new Engine(1450,"Toyota");
            Lorry lorry= new Lorry("marka = Man", "B", 500, driver, engine, 300);
            SportCar sportCar = new SportCar("marka2_sportcar", "carClass2_sportcar", 1500, driver, engine, 100);

            lorry.printInfo();
        }
    }

