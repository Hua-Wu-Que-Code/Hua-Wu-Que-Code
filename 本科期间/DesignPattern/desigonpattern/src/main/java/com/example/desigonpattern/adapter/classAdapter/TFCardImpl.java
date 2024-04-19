package com.example.desigonpattern.adapter.classAdapter;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description TF卡片的一个实体类
 * @date 2023/3/3 21:42:10
 */
public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        String msg = "TFCard reads hello world";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard writes " + msg);
    }
}
