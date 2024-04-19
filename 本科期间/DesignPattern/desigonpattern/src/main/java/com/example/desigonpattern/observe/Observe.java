package com.example.desigonpattern.observe;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description 抽象观察者
 * @date 2023/3/4 11:53:14
 */
public interface Observe {

    //推送消息
    void Upgrade(String msg);
}
