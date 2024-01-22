package com.java.design.creational.prototype;


class Pizza2 implements Cloneable {
    String name;

    public Pizza2(String name) {
        this.name = name;
    }

    @Override
   public Pizza2 clone() throws CloneNotSupportedException{
       return (Pizza2) super.clone();
   }

}

public class ProtoType {
    public static void main(String[] args) throws CloneNotSupportedException {

        Pizza2 p1= new Pizza2("veg Pizza");
        Pizza2 p2= p1.clone();

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());


    }
}
