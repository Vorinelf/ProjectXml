package flat;

public class LongueRoomDevice extends Device {
    private boolean LCD_display;
    private boolean wi_fi;
    private boolean bluetooth;

    public LongueRoomDevice () {}

    public LongueRoomDevice(String name, int powerSize_kW, boolean powerON, boolean lcd_display, boolean wi_fi, boolean bluetooth) {
        super(name, powerSize_kW, powerON);
        LCD_display = lcd_display;
        this.wi_fi = wi_fi;
        this.bluetooth = bluetooth;
    }

    public void setLCD_display(boolean LCD_display) {
        this.LCD_display = LCD_display;
    }

    public void setWi_fi(boolean wi_fi) {
        this.wi_fi = wi_fi;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public boolean isLCD_display() {
        return LCD_display;
    }

    public boolean isWi_fi() {
        return wi_fi;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }
}

