package airConditioner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    private AirConditioner airConditioner;

    @BeforeEach
    public void setUp() {
        airConditioner = new AirConditioner();
    }


    @Test
    public void testThatAcIsOn() {

        assertFalse(airConditioner.isOn());
        airConditioner.powerOn();
        assertTrue(airConditioner.isOn());

    }
    @Test
    public void testThatAcIsOff() {

        assertFalse(airConditioner.isOn());
        assertFalse(airConditioner.isOn());

    }

    @Test
    public void testThatTemperatureIncreases() {

        airConditioner.increaseTemperature();
        assertEquals(17, airConditioner.getTemperature());

    }
    @Test
    public void testThatTemperatureDecreases()  {

        airConditioner.increaseTemperature();
        airConditioner.decreaseTemperature();
        assertEquals(16, airConditioner.getTemperature());
    }
    @Test
    public void testThatTemperatureCannotIncreaseBeyond30() {

        for (int count = 16; count <= 30; count++) {
            airConditioner.increaseTemperature();
        }
        assertEquals(30, airConditioner.getTemperature());
    }

    @Test
    public void testThatTemperatureCannotDecreaseBelow16() {

        for (int count = 30; count > 16; count--) {
            airConditioner.decreaseTemperature();
        }
        assertEquals(16, airConditioner.getTemperature());
    }
}
