package com.example.desigonpattern.Singleton.lazySingleton;

public class LazySingleton {
    private volatile static LazySingleton lazySingleton;
    private  LazySingleton () {

    }
    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
