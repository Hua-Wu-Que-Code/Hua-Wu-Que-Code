package com.example.desigonpattern.Singleton.innerClassSingleton;

public class InnerClassSingleton {
    private static class InnerClassSingleHolder{
        private static InnerClassSingleton innerClassSingleton = new InnerClassSingleton();
    }

    private InnerClassSingleton() {}

    public static InnerClassSingleton getInstance() {
        return InnerClassSingleHolder.innerClassSingleton;
    }

}
