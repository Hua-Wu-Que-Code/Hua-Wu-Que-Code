package com.example.desigonpattern.respinsibility;

import lombok.Data;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description 请假条类
 * @date 2023/3/4 10:45:37
 */
@Data
public class LeaveRequest {
    //请假人姓名
    private String name;

    //请加天数
    private int day;

    //请假内容
    private String content;

    public LeaveRequest(String name, int day, String content) {
        this.name = name;
        this.day = day;
        this.content = content;
    }


}
