package ru.smago.command;

import ru.smago.device.Fan;

public class FanOnCommand implements Command {
    private final Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
    }
}
