package com.java.design.creational.Factory;


import java.util.List;

class Pizza1{
    String name;
    List<String> toppings;
    double price;

    public Pizza1(String name, List<String> toppings, double price) {
        this.name = name;
        this.toppings = toppings;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza1{" +
                "name='" + name + '\'' +
                ", toppings=" + toppings +
                ", price=" + price +
                '}';
    }
}

/* --> This has been spilted into multipleclasses to overcome open closed rule break
class pizza1Factory{

    public static Pizza1 createPizza(String type){
        if(type.equalsIgnoreCase("veg")){

        }else if(type.equalsIgnoreCase("nonveg")){
            return new Pizza1("veg",List.of("Mutton","Mayo","Cheese"),800);
        }else{
            throw new IllegalArgumentException("Invalid Type");
        }

    }
} */

interface PizzaFactory1{
    Pizza1 createPizza();

}

class VegPizzafactory implements PizzaFactory1{

    @Override
    public Pizza1 createPizza() {
        return new Pizza1("veg",List.of("corn","Mayo","Cheese"),600);
    }
}

class NonVegPizzafactory implements PizzaFactory1{

    @Override
    public Pizza1 createPizza() {
        return new Pizza1("veg",List.of("Mutton","Mayo","Cheese"),800);
    }
}


public class FactoryPatternProper {
    public static void main(String[] args) {
        PizzaFactory1 vegPizza1 = new VegPizzafactory();
        System.out.println(vegPizza1.createPizza().toString());

        PizzaFactory1 nonvegPizza1 = new NonVegPizzafactory();
        System.out.println(nonvegPizza1.createPizza().toString());
    }

}
