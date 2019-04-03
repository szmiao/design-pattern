package com.design.pattern.mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-04-03 15:13:33
 **/
public class ColleagueTextField extends TextField implements TextListener, Colleague {

    private Mediator mediator;

    public ColleagueTextField(String text, int columns) {
        super(text, columns);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled ? Color.white : Color.lightGray);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        mediator.colleagueChanged();
    }
}
