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

    @Test
    public void testThatBikeCanAccelerateAndDecelerateWhenTurnedOn(){

        bike.toggle();
        assertTrue(bike.bikeIsOn());
        bike.accelerate();
        assertEquals(1, bike.getSpeed());
        bike.decelerate();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void bikeCanAccelerateWhenTurnedOn_testGearOne() {

        bike.toggle();

        for (int speed = 0; speed < 20; speed++) {
            bike.accelerate();
        }
        assertEquals(20, bike.getSpeed());
        assertEquals(1, bike.getGear());
    }

    @Test
    public void bikeCanAccelerateWhenTurnedOn_testGearTwo() {

        bike.toggle();

        for (int speed = 1; speed <= 22; speed++) {
            bike.accelerate();
        }
        assertEquals(23, bike.getSpeed());
        assertEquals(2, bike.getGear());

        bike.accelerate();
        bike.accelerate();
        assertEquals(27, bike.getSpeed());
        assertEquals(2, bike.getGear());


    }

    @Test
    public void bikeCanAccelerateWhenTurnedOn_testGearThree() {

        bike.toggle();

        for  (int speed = 0; speed < 26; speed++) {
            bike.accelerate();
        }
        assertEquals(31, bike.getSpeed());
        assertEquals(3, bike.getGear());

        bike.accelerate();
        bike.accelerate();
        assertEquals(37,bike.getSpeed());
        assertEquals(3, bike.getGear());
    }


    @Test
    public void bikeCanAccelerateWhenTurnedOn_testGearFour() {
        bike.toggle();

        for (int speed = 0; speed < 50; speed++) {
            bike.accelerate();
        }
        assertEquals(123, bike.getSpeed());
    }
    @Test
    public void bikeCanDecelerate_testBrake() {

        bike.toggle();

        for (int speed = 20; speed >= 20; speed--) {
            bike.decelerate();
        }
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void bikeCanDecelerate_gearOneTest() {

        bike.toggle();

        for (int speed = 1; speed < 5; speed++) {
            bike.accelerate();
        }
        assertEquals(4, bike.getSpeed());
        for (int speed = 1; speed < 900; speed++) {
            bike.decelerate();
        }
        assertEquals(0, bike.getSpeed());
        assertEquals(1, bike.getGear());

    }
    @Test
    public void bikeCanDecelerate_gearTwoTest() {

        bike.toggle();

        for (int speed = 1; speed < 24; speed++) {
            bike.accelerate();
        }
        assertEquals(25, bike.getSpeed());

        bike.decelerate();
        assertEquals(23, bike.getSpeed());
        assertEquals(2, bike.getGear());

    }
    @Test
    public void bikeCanDecelerate_gearThreeTest() {

        bike.toggle();

        for (int speed = 1; speed < 30; speed++) {
            bike.accelerate();
        }
        assertEquals(40, bike.getSpeed());

        for (int speed = 38; speed > 35; speed--) {
            bike.decelerate();
        }
        assertEquals(31, bike.getSpeed());
        assertEquals(3, bike.getGear());
    }
    @Test
    public void bikeCanDecelerate_gearFourTest() {

        bike.toggle();

        for (int speed = 1; speed < 34; speed++) {
            bike.accelerate();
        }
        assertEquals(55, bike.getSpeed());

        for (int speed = 42; speed > 40; speed--) {
            bike.decelerate();
        }
        assertEquals(47, bike.getSpeed());
        assertEquals(4, bike.getGear());
    }
    @Test
    public void testThatBikeCanAccelerateAndRemainInTheSameGear() {
        bike.toggle();
        for (int speed = 0; speed < 15; speed++) {
            bike.accelerate();
        }
        assertEquals(15, bike.getSpeed());
        assertEquals(1, bike.getGear());
    }
    @Test
    public void testThatBikeCanDecelerateAndRemainInTheSameGear() {
        bike.toggle();
        for (int speed = 15; speed > 1; speed--) {
            bike.accelerate();
        }
        assertEquals(14, bike.getSpeed());
        assertEquals(1, bike.getGear());
    }

}
