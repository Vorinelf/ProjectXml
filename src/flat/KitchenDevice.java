package flat;


public class KitchenDevice extends Device {
    private int maxTemperature;
    private int minTemperature;

    public KitchenDevice (){
            }

    public KitchenDevice(String name, int powerSize_kW, boolean powerON) {
        super(name, powerSize_kW, powerON);
    }

    void resultTemperature() {
        int resultT = maxTemperature - minTemperature;
        System.out.println(resultT);

    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }
}



