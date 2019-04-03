package com.design.pattern.mediator;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-04-03 15:17:05
 **/
public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {

    private Mediator mediator;

    public ColleagueCheckbox(String label, boolean state, CheckboxGroup group) throws HeadlessException {
        super(label, state, group);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged();
    }
}
