package com.design.pattern.state;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-04-08 16:40:36
 **/
public class DayState implements State {

    private static DayState singleton = new DayState();

    private DayState() {
    }

    public static DayState getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("使用金库（白天）");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃（白天）");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("正常通话（白天）");
    }

    @Override
    public String toString() {
        return "[白天]";
    }
}
