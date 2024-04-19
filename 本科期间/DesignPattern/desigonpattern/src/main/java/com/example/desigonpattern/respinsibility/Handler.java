package com.example.desigonpattern.respinsibility;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description 抽象处理者
 * @date 2023/3/4 10:47:59
 */
public abstract class Handler {
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    //领导处理的请假天数区间
    private int startNum;
    private int endNum;

    //声明上级领导
    private Handler nextHandler;

    public Handler(int startNum) {
        this.startNum = startNum;
    }

    public Handler(int startNum, int endNum) {
        this.startNum = startNum;
        this.endNum = endNum;
    }

    //设置上级领导
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //领导处理请假条的方法
    protected abstract void handleLeave(LeaveRequest leaveRequest);

    //递交请假条的方法

}
