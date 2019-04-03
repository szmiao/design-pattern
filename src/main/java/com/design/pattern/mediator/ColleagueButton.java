package com.design.pattern.mediator;

import java.awt.*;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-04-03 11:58:52
 **/
public class ColleagueButton extends Button implements Colleague {

    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
