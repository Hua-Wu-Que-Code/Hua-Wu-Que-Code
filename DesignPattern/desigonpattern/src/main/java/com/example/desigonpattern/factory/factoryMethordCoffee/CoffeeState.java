package com.example.desigonpattern.factory.factoryMethordCoffee;

public class CoffeeState {
    private CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = coffeeFactory.CreateCOffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
