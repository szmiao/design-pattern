package com.design.pattern.state;

public interface Context {

    // 设置时间
    public void setClock(int hour);

    // 改变状态
    public void changeState(State state);

    // 联系警报中心
    public void callSecurityCenter(String msg);

    // 在警报中心留下记录
    public void recordLog(String msg);
}
