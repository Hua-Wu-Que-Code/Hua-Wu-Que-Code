package com.example.desigonpattern.factory.abstractFactory;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description 甜品生产工厂
 * @date 2023/3/1 20:04:04
 */
public class DesertFactory implements AbstractFactory {
    @Override
    public Coffee createCoffee() {
        return null;
    }

    @Override
    public Desert createDesert() {
        return null;
    }
}
