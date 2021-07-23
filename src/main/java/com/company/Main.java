package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.professions.Person;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {

        public static void main(String[] args) {

            Person person = new Person();
            person.setFullName("Ivan Ivanovich Kuzmenko");
            person.setAge(18);


            Driver driver = new Driver();
            driver.setExperience(15);

            Car car = new Car();
            car.setModelCar("Toyota");
            car.setClassCar("B");
            car.setWeight(1500);


            Engine engine = new Engine();
            engine.setCompany("Toyota");
            engine.setPower(150);

            Lorry lorry= new Lorry();
            lorry.setCarrying(10000);

            SportCar sportCar = new SportCar();
            sportCar.setSpeed(350);



            System.out.println(person.getAge());
        }
    }

