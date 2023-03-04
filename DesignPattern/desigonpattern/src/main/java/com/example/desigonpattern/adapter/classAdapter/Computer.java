package com.example.desigonpattern.adapter.classAdapter;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description 电脑类
 * @date 2023/3/3 21:56:27
 */
public class Computer {

    //从SD卡中读取数据
    public String readSD(SDCard sdCard) {
        if (sdCard == null) throw new NullPointerException("SDCard is damaged");
        return sdCard.readSD();
    }

    //往SD卡中写入数据
    public void writeSD(SDCard sdCard) {
        if (sdCard == null) throw new NullPointerException("SDCard is damaged");
        sdCard.writeSD("i'm HUAWUQUE");
    }
}
