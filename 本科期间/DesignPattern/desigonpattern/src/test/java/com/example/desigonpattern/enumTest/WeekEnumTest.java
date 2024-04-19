package com.example.desigonpattern.enumTest;

import com.example.desigonpattern.Singleton.enumTest.WeekEnum;

public class WeekEnumTest {
    public static void main(String[] args) {
        WeekEnum weekEnum = WeekEnum.MONDAY;
        System.out.println(weekEnum.getDate());
        weekEnum.setDate("星期六");
        System.out.println(weekEnum.getDate());
    }
}
