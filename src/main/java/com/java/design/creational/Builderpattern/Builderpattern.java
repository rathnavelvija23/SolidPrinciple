package com.java.design.creational.Builderpattern;


import java.util.List;

class Pizza3{

    String name;
    List<String> toppings;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }
}

interface PizzaBuilder{
    Pizza3 getPizza();
    void buildName();
    void buildTopping();

}

class VegPizza implements  PizzaBuilder{

private Pizza3 pizza;

    public VegPizza() {
        this.pizza = new Pizza3();
    }

    @Override
    public Pizza3 getPizza() {
        return pizza;
    }

    @Override
    public void buildName() {
        pizza.setName("veg");
    }

    @Override
    public void buildTopping() {
        pizza.setToppings(List.of("corn","cheese"));
    }
}


class PizzaDirector{

    private PizzaBuilder pizzaBuilder;

    public PizzaDirector(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder = pizzaBuilder;
    }

    public void constructPizza(){
        pizzaBuilder.buildName();
        pizzaBuilder.buildTopping();
    }

}
public class Builderpattern {

    public static void main(String[] args) {
        VegPizza vegpizza = new VegPizza();
        PizzaDirector pizzaDirector = new PizzaDirector(vegpizza);
        pizzaDirector.constructPizza();
        Pizza3 pizza = vegpizza.getPizza();
        System.out.println(pizza.getName()+":"+pizza.getToppings());
    }
}
