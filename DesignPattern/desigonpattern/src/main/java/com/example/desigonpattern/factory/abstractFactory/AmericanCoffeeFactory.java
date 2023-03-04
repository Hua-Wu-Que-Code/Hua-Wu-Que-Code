package com.example.desigonpattern.factory.abstractFactory;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description 美式咖啡生产工厂
 * @date 2023/3/1 20:02:44
 */
public class AmericanCoffeeFactory implements AbstractFactory{
    @Override
    public Coffee createCoffee() {
        return null;
    }

    @Override
    public Desert createDesert() {
        return null;
    }
}
