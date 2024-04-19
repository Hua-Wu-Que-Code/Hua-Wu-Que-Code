package com.example.desigonpattern.adapter.classAdapter;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description 客户端类
 * @date 2023/3/3 22:00:34
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String msg = computer.readSD(new SDAdapterTF());
        System.out.println(msg);

        computer.writeSD(new SDCardImpl());
    }




}
