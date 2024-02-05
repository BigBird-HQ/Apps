package automaticBike;

public class Bike {
    private boolean isOn;
    private int speed;
    private int gear;

    public boolean bikeIsOn() {
        return isOn;
    }


    public void toggle() {
        isOn = !isOn;
    }

    public void accelerate() {
        if (speed >= 0 && speed <= 20) {
            speed++;
        } else if (speed >= 21 && speed <=30) {
            speed += 2;
        } else if (speed >= 31 && speed <= 40) {
            speed += 3;
        } else if (speed >= 41) {
            speed += 4;
        }

    }

    public int getSpeed() {
        return speed;
    }

    public void decelerate() {

    }
}
