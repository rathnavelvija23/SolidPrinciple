package com.java.design.Strutural.proxy;


class Car{
    String carName;

    public Car(String carName) {
        this.carName = carName;
    }
}
interface CreateCar{
    Car create();
}

class CreateCarImpl implements CreateCar{

    @Override
    public Car create() {
        return new Car("Nexon");
    }
}

class Proxy1 implements CreateCar{

    private CreateCar createCar;

    @Override
    public Car create() {
       createCar = new CreateCarImpl();
       return createCar.create();
    }
}
public class Proxypattern {
    public static void main(String[] args) {
        Proxy1 p = new Proxy1();
        p.create();
        System.out.println(p.create().carName);
    }


}
