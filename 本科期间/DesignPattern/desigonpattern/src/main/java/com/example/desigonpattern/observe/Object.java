package com.example.desigonpattern.observe;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description 抽象主题类
 * @date 2023/3/4 11:52:38
 */
public interface Object {

    //添加订阅者
    void attach(Observe observe);

    //删除订阅者
    void detach(Observe observe);

    //通知订阅者更新消息
    void notify(String msg);
}
