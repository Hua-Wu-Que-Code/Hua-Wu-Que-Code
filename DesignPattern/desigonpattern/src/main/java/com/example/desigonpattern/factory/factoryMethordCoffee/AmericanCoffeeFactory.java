package com.example.desigonpattern.factory.factoryMethordCoffee;

public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee CreateCOffee() {
        return new AmericanCoffee();
    }
}
