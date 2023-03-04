package com.example.desigonpattern.factory.abstractFactory;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description 抽象工厂
 * @date 2023/3/1 19:59:39
 */
public interface AbstractFactory {
    public Coffee createCoffee();

    public Desert createDesert();
}
