package com.example.desigonpattern.factory.factoryMethordCoffee;

public class AmericanCoffee implements Coffee{

    @Override
    public String getName() {
        return "美式咖啡";
    }

    @Override
    public void addMilk() {
        System.out.println("加奶");
    }

    @Override
    public void addSugar() {
        System.out.println("加糖");
    }
}
