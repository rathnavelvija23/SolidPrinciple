package com.java.design.creational.SingletonPattern;

public class Singleton {

    private static final Singleton eagerInstance = new Singleton();
    public Singleton getEagerInstance(){
        return eagerInstance;
    }

    public static Singleton instance = null;
    private Singleton(){}

    public Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(new Singleton().getInstance().hashCode());
        System.out.println(new Singleton().getInstance().hashCode());
        System.out.println(new Singleton().getEagerInstance().hashCode());
        System.out.println(new Singleton().getEagerInstance().hashCode());

    }
}
