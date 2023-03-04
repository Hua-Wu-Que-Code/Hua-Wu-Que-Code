package com.example.desigonpattern.adapter.objectAdapter;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description TF卡片
 * @date 2023/3/3 21:40:18
 */
public interface TFCard {
    String readTF();
    void writeTF(String msg);
}
