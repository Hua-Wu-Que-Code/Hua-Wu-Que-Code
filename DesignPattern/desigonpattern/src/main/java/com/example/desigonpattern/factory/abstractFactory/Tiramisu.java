package com.example.desigonpattern.factory.abstractFactory;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description 提拉米苏类
 * @date 2023/3/1 19:53:37
 */
public class Tiramisu implements Desert{
    @Override
    public void show() {
        System.out.println("提拉米苏");
    }
}
