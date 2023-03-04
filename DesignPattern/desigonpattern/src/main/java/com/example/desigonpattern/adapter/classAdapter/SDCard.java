package com.example.desigonpattern.adapter.classAdapter;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description SD卡片
 * @date 2023/3/3 21:39:25
 */
public interface SDCard {
    String readSD();
    void writeSD(String msg);
}
