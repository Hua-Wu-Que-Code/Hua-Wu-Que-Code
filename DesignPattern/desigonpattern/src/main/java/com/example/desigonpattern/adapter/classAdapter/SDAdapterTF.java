package com.example.desigonpattern.adapter.classAdapter;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description SD卡和TF卡适配器
 * @date 2023/3/3 21:43:12
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{
    @Override
    public String readSD() {
        System.out.println("适配器从TF卡中读取数据");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("适配器往TF卡中写入数据");
        writeTF(msg);
    }
}
