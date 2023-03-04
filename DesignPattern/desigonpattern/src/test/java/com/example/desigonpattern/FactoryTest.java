package com.example.desigonpattern;

import com.example.desigonpattern.factory.factoryMethordCoffee.AmericanCoffee;
import com.example.desigonpattern.factory.factoryMethordCoffee.Coffee;
import com.example.desigonpattern.factory.factoryMethordCoffee.CoffeeState;

public class FactoryTest {
    public static void main(String[] args) {
        CoffeeState coffeeState = new CoffeeState();
        coffeeState.setCoffeeFactory(AmericanCoffee::new);
        Coffee coffee =  coffeeState.orderCoffee();
        System.out.println(coffee.getName());
    }
}
