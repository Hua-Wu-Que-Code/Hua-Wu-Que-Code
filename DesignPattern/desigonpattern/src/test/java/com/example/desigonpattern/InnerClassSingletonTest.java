package com.example.desigonpattern;

import com.example.desigonpattern.Singleton.innerClassSingleton.InnerClassSingleton;

public class InnerClassSingletonTest {
    public static void main(String[] args) {
        InnerClassSingleton innerClassSingleton = InnerClassSingleton.getInstance();
        InnerClassSingleton innerClassSingleton1 = InnerClassSingleton.getInstance();

        System.out.println(innerClassSingleton);
        System.out.println(innerClassSingleton1);
    }
}
