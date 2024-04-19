package com.example.desigonpattern.adapter.objectAdapter;


/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description SD卡和TF卡适配器
 * @date 2023/3/3 21:43:12
 */
public class SDAdapterTF implements SDCard {
    //声明适配类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    public String readSD() {
        System.out.println("适配器从TF卡中读取数据");
        return tfCard.readTF();
    }

    public void writeSD(String msg) {
        System.out.println("适配器往TF卡中写入数据");
        tfCard.writeTF(msg);
    }
}
