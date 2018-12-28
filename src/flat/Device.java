package flat;

public abstract class Device {
    private String name;
    private int serialNumber;
    static int countSerial = 0;
    private int powerSizekW;
    private boolean powerON;
    public Device() {
    }
    public Device(String name, int powerSize_kW, boolean powerON) {
        this.name = name;
        this.powerSizekW = powerSize_kW;
        this.powerON = powerON;
         }



    public void setName(String name) {
        this.name = name;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public static void setCountSerial(int countSerial) {
        Device.countSerial = countSerial;
    }

    public void setPowerSizekW(int powerSizekW) {
        this.powerSizekW = powerSizekW;
    }

    public void setPowerON(boolean powerON) {
        this.powerON = powerON;
    }

    public String getName() {
        return name;
    }

    public static int getCountSerial() {
        return countSerial;
    }

    public int getPowerSizekW() {
        return powerSizekW;
    }

    public boolean isPowerON() {
        return powerON;
    }

    void serialNumb() {
        this.serialNumber = countSerial++;
    }

    public int getSerialNumber() {
        return serialNumber;
    }


}
