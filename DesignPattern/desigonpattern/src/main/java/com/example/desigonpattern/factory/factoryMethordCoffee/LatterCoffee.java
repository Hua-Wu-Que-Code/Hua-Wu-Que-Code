package com.example.desigonpattern.factory.factoryMethordCoffee;

public class LatterCoffee implements Coffee{
    @Override
    public String getName() {
        return "拿铁咖啡";
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
