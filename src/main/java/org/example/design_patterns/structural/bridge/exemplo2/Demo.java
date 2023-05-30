package org.example.design_patterns.structural.bridge.exemplo2;


import org.example.design_patterns.structural.bridge.exemplo2.devices.Device;
import org.example.design_patterns.structural.bridge.exemplo2.devices.Radio;
import org.example.design_patterns.structural.bridge.exemplo2.devices.Tv;
import org.example.design_patterns.structural.bridge.exemplo2.remotes.AdvancedRemote;
import org.example.design_patterns.structural.bridge.exemplo2.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
