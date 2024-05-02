package ru.smago;

import ru.smago.command.*;
import ru.smago.contol.RemoteControl;
import ru.smago.contol.SimpleRemoteControl;
import ru.smago.device.Fan;
import ru.smago.device.GarageDoor;
import ru.smago.device.Light;

public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Fan fan = new Fan();

//        LightOnCommand lightOn = new LightOnCommand(light);
//        LightOffCommand lightOff = new LightOffCommand(light);

        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageClose = new GarageDoorCloseCommand(garageDoor);

//        FanOnCommand fanOn = new FanOnCommand(fan);
//        FanOffCommand fanOff = new FanOffCommand(fan);

        simpleRemoteControl.setSlot(light::on);
        simpleRemoteControl.buttonWasPressed();

        simpleRemoteControl.setSlot(garageOpen);
        simpleRemoteControl.buttonWasPressed();

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, light::on, light::off);
        remoteControl.setCommand(1, garageOpen, garageClose);
        remoteControl.setCommand(2, fan::on, fan::off);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
    }
}