package flat;


public class BathroomDevice extends Device {
    private boolean waterproof;

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }

    public BathroomDevice(){}

    public BathroomDevice(String name, int powerSizekW, boolean powerON, boolean waterproof) {
        super(name, powerSizekW, powerON);

        this.waterproof = waterproof;
    }

    public boolean isWaterproof() {
        return waterproof;
    }
}

