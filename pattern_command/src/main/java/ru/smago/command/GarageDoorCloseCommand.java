package ru.smago.command;

import ru.smago.device.GarageDoor;

public class GarageDoorCloseCommand implements Command {
    private final GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightOff();
        garageDoor.down();
        garageDoor.stop();
    }
}
