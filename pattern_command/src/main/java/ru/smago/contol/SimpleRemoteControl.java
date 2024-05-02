package ru.smago.contol;

import ru.smago.command.Command;

public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl() {}

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
