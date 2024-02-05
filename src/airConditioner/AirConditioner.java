package airConditioner;

public class AirConditioner {
    private boolean AcIsOn;
    private int temperature = 16;

    public boolean isOn() {
        return AcIsOn;
    }
    public void powerOn() {
        AcIsOn = true;
    }

    public void increaseTemperature() {
        if (temperature >= 16 && temperature < 30) {
            temperature++;
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if (temperature > 16 && temperature <= 30) {
            temperature--;
        }
    }
}
