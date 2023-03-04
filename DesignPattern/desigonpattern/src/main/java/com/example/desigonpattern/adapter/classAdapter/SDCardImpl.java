package com.example.desigonpattern.adapter.classAdapter;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description SD卡片的一个实体类
 * @date 2023/3/3 21:41:22
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "SDCard reads hello world";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard writes " + msg);
    }
}
