package com.example.desigonpattern.factory.factoryMethordCoffee;

public class LatterCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee CreateCOffee() {
        return new LatterCoffee();
    }
}
