package com.java.design.Strutural.Facade;

class Engine{
    void start(){
        System.out.println("Car started");
    }
}

class AC{
    void turnOn(){
        System.out.println("AC turned on");
    }
}

class CarFacade{
    private Engine engine;
    private AC ac;

    public CarFacade() {
        this.engine = new Engine();
        this.ac = new AC();
    }

    void startCar(){
        engine.start();
        ac.turnOn();
    }
}

public class Facadepattern {
    public static void main(String[] args) {
        CarFacade car = new CarFacade();
        car.startCar();

    }
}
