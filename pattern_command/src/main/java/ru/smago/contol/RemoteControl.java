package ru.smago.contol;

import ru.smago.command.Command;

public class RemoteControl {
    private final Command[] onCommands;
    private final Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = () -> {};

        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 7; i++) {
            builder.append("[slot ").append(i).append("] ")
                    .append(onCommands[i].getClass().getName()).append("   ")
                    .append(offCommands[i].getClass().getName()).append("\n");
        }
        return builder.toString();
    }
}
