package com.example.desigonpattern.Singleton.enumTest;

public enum color {
    RED,GREEN,BLACK;

    private color()
    {
        System.out.println("Constructor called for : " + this.toString());
    }

    public void colorInfo()
    {
        System.out.println("Universal Color");
    }

}
