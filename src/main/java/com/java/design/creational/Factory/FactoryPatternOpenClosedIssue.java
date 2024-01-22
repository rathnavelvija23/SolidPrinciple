package com.java.design.creational.Factory;


import java.util.List;

class Pizza{
    String pizzaname;
    List<String> toppings;
    double price;

    public Pizza(String pizzaname, List<String> toppings, double price) {
        this.pizzaname = pizzaname;
        this.toppings = toppings;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaname='" + pizzaname + '\'' +
                ", toppings=" + toppings +
                ", price=" + price +
                '}';
    }
}
 class Pizzafactory{
    public static Pizza  createPizza(String type){
            if(type.equalsIgnoreCase("veg")){
                return new Pizza("Veg",List.of("corn","cheese"),200);
            }else if(type.equalsIgnoreCase("nonveg")){
                return new Pizza("Non Veg",List.of("chicken","cheese"),200);
            }else{
                throw new IllegalArgumentException("Invalid Pizza");
            }
    }
}

public class FactoryPatternOpenClosedIssue{
    public static void main(String[] args) {
         Pizza vegPizza = Pizzafactory.createPizza("veg");
         Pizza nonVegPizza = Pizzafactory.createPizza("nonveg");
        System.out.println("Veg-Pizza  :"+vegPizza.toString());
        System.out.println("Non Veg-Pizza  :"+nonVegPizza.toString());
    }
}
