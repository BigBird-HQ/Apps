package televisionSet;

public class Television {
    private boolean isOn;
    private int volume;
    private int channel;


    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        isOn = !isOn;
    }

    public void increaseVolume() {
        if (volume >= 0 && volume < 100) {
            volume++;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void decreaseVolume() {
//        if (volume > 0 && volume > 100) {
//            volume--;
//        }
        volume--;
    }

    public void changeChannelUp() {
        channel++;
    }

    public int getChannel() {
        return channel;
    }

    public void changeChannelDown() {
        channel--;
    }
}
