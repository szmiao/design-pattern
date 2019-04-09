package com.design.pattern.command.command;

import java.util.Iterator;
import java.util.Stack;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-04-09 17:11:14
 **/
public class MacroCommand implements Command {

    private Stack commands = new Stack();

    @Override
    public void execute() {
        Iterator iterator = commands.iterator();
        while (iterator.hasNext()) {
            Command command = (Command)iterator.next();
            command.execute();
        }
    }

    public void append(Command command) {
        if (command != this) {
            commands.push(command);
        }
    }

    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }
}
