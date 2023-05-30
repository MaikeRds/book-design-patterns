package org.example.design_patterns.structural.bridge.exemplo2.remotes;

import org.example.design_patterns.structural.bridge.exemplo2.devices.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
