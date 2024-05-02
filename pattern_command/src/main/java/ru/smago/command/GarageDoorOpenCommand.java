package ru.smago.command;

import ru.smago.device.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    private final GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        this.garageDoor.up();
        this.garageDoor.stop();
        this.garageDoor.lightOn();
    }
}
