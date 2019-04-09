package com.design.pattern.command.drawer;

import com.design.pattern.command.command.MacroCommand;

import java.awt.*;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-04-09 17:18:14
 **/
public class DrawCanvas extends Canvas implements Drawable {

    private Color color = Color.red;

    private int radius = 6;

    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    @Override
    public void paint(Graphics graphics) {
        history.execute();
    }

    @Override
    public void draw(int x, int y) {
        Graphics graphics = getGraphics();
        graphics.setColor(color);
        graphics.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
