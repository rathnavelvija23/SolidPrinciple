package com.java.design.creational.AdapterFactory;

import java.util.List;

interface PizzaAdapter1 {
        void displayInfo();
        }

// Adaptee class
class Pizza {
    private String name;
    private List<String> toppings;
    private double price;

    public Pizza(String name, List<String> toppings, double price) {
        this.name = name;
        this.toppings = toppings;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Pizza: " + name);
        System.out.println("Toppings: " + toppings);
        System.out.println("Price: $" + price);
    }
}

// Adapter classes
class MargheritaPizzaAdapter implements PizzaAdapter1 {
    private Pizza margheritaPizza;

    public MargheritaPizzaAdapter() {
        margheritaPizza = new Pizza("Margherita", List.of("Tomato Sauce", "Mozzarella", "Basil"), 10.99);
    }

    @Override
    public void displayInfo() {
        margheritaPizza.displayInfo();
    }
}

class PepperoniPizzaAdapter implements PizzaAdapter1 {
    private Pizza pepperoniPizza;

    public PepperoniPizzaAdapter() {
        pepperoniPizza = new Pizza("Pepperoni", List.of("Tomato Sauce", "Mozzarella", "Pepperoni"), 12.99);
    }

    @Override
    public void displayInfo() {
        pepperoniPizza.displayInfo();
    }
}

// Client code
public class AdapterFactory {
    public static void main(String[] args) {
        PizzaAdapter1 margheritaAdapter = new MargheritaPizzaAdapter();
        margheritaAdapter.displayInfo();

        PizzaAdapter1 pepperoniAdapter = new PepperoniPizzaAdapter();
        pepperoniAdapter.displayInfo();
    }
}
