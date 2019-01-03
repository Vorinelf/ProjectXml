package flat;

public class LongueRoomDevice extends Device {
    private boolean lcdDisplay;
    private boolean wiFi;
    private boolean bluetooth;

    public LongueRoomDevice () {}

    public LongueRoomDevice(String name, int powerSizekW, boolean powerON, boolean lcdDisplay, boolean wiFi, boolean bluetooth) {
        super(name, powerSizekW, powerON);
        lcdDisplay = lcdDisplay;
        this.wiFi = wiFi;
        this.bluetooth = bluetooth;
    }

    public boolean isLcdDisplay() {
        return lcdDisplay;
    }

    public void setLcdDisplay(boolean lcdDisplay) {
        this.lcdDisplay = lcdDisplay;
    }

    public boolean isWiFi() {
        return wiFi;
    }

    public void setWiFi(boolean wiFi) {
        this.wiFi = wiFi;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
}

