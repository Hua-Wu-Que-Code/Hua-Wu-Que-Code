package com.example.desigonpattern;

import com.example.desigonpattern.Singleton.hungrySingleton.HungrySingleton;

public class HungrySingletonTest {
    public static void main(String[] args) {
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
        System.out.println(hungrySingleton1);
        System.out.println(hungrySingleton2);

    }
}
