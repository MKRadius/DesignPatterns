package remotes;

import devices.*;

public class SmartRemote extends AdvancedRemote {
    public SmartRemote(Device device) {
        super(device);
    }

    public void voiceControl() {
        System.out.println("Remote: Voice control");
    }
}
