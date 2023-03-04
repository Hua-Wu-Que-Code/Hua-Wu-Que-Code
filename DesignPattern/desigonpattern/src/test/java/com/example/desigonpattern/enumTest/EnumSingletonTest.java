package com.example.desigonpattern.enumTest;

import com.example.desigonpattern.Singleton.enumSingleton.EnumSingleton;

public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        System.out.println(enumSingleton.getFlag());
    }
}
