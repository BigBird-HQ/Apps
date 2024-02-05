package automaticBike;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    Bike bike;

    @BeforeEach
    public void setUp() {
        bike = new Bike();
    }

    @Test
    public void testThatBikeCanBeTurnedOn() {

        assertFalse(bike.bikeIsOn());
        bike.toggle();
        assertTrue(bike.bikeIsOn());
    }

    @Test
    public void testThatBikeCanBeTurnedOff() {

        bike.toggle();
        assertTrue(bike.bikeIsOn());
        bike.toggle();
        assertFalse(bike.bikeIsOn());
    }

//    @Test
//  public void testThatBikeCanAccelerateWhenTurnedOn(){

//        bike.toggle();
//        assertTrue(bike.bikeIsOn());
//        bike.accelerate();
//        assertEquals(1, bike.getBikeSpeed());
//    }

    @Test
    public void bikeCanAccelerateWhenTurnedOn_testGearOne() {

        bike.toggle();
        assertTrue(bike.bikeIsOn());
        for (int speed = 0; speed < 20; speed++) {
            bike.accelerate();
        }
        assertEquals(20, bike.getSpeed());
    }

    @Test
    public void bikeCanAccelerateWhenTurnedOn_testGearTwo() {

        bike.toggle();
        assertTrue(bike.bikeIsOn());
        for (int speed = 21; speed < 30; speed++) {
            bike.accelerate();
        }
        assertEquals(9, bike.getSpeed());
    }

    @Test
    public void bikeCanAccelerateWhenTurnedOn_testGearThree() {

        bike.toggle();
        assertTrue(bike.bikeIsOn());
        for (int speed = 31; speed < 40; speed++) {
            bike.accelerate();
        }
        assertEquals(9, bike.getSpeed());
    }

    @Test
    public void bikeCanAccelerateWhenTurnedOn_testGearFour() {

        bike.toggle();
        assertTrue(bike.bikeIsOn());
        int speed = 41;
        while (speed >= 41) {
            speed += 4;
            bike.accelerate();
        }
        assertEquals(41, bike.getSpeed());
    }
    @Test
    public void bikeCanDecelerate_testBrake() {

        bike.toggle();
        assertTrue(bike.bikeIsOn());
        for (int speed = 21; speed >= 20; speed--) {
            bike.decelerate();
        }
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void bikeCanDecelerate_gearTwoTest() {

        bike.toggle();
        for (int count = 31; count >= 20; count--) {

        }
    }
}
