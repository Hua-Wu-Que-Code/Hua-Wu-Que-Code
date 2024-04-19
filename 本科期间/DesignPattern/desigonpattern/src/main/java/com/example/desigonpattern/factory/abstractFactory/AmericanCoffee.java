package com.example.desigonpattern.factory.abstractFactory;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description 美式咖啡类
 * @date 2023/3/1 19:51:20
 */
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
