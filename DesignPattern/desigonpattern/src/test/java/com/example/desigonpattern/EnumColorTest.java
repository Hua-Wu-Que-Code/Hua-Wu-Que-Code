package com.example.desigonpattern;

import com.example.desigonpattern.Singleton.enumTest.color;

public class EnumColorTest {

    public static void main(String[] args) {
        color color = com.example.desigonpattern.Singleton.enumTest.color.GREEN;

        System.out.println(color);
        color.colorInfo();
    }
}
