package com.design.pattern.command.drawer;

import com.design.pattern.command.command.Command;

import java.awt.*;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-04-09 17:15:47
 **/
public class DrawerCommand implements Command {

    protected Drawable drawable;

    private Point position;

    public DrawerCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
