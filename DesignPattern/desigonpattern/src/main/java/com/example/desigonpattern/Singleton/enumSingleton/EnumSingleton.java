package com.example.desigonpattern.Singleton.enumSingleton;

public enum EnumSingleton {
    INSTANCE("小小测试，可笑可笑");

    private String flag;

    private EnumSingleton(String flag) {
        this.flag = flag;
    }

    public String getFlag() {
        return this.flag;
    }
}
