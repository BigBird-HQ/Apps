package televisionSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    Television myTV;

    @BeforeEach
    public void doThis() {
        myTV = new Television();
    }

    @Test
    public void televisionCanBeTurnedOn_turnTVOnTest() {
        assertFalse(myTV.isOn());
        myTV.toggle();
        assertTrue(myTV.isOn());

    }

    @Test
    public void televisionCanBeTurnedOff_turnTVOffTest() {
        myTV.toggle();
        assertTrue(myTV.isOn());
        myTV.toggle();
        assertFalse(myTV.isOn());

    }

    @Test
    public void increaseVolumeTest() {
        myTV.toggle();
        myTV.increaseVolume();
        assertEquals(1, myTV.getVolume());

    }

    @Test
    public void increaseVolumeBeyond100_volumeCannotIncreaseBeyond100Test() {
        myTV.toggle();
        for (int count = 1; count < 121; count++) {
            myTV.increaseVolume();
        }
        assertEquals(100, myTV.getVolume());
    }

    @Test
    public void decreaseVolumeTest() {
        myTV.toggle();
        myTV.increaseVolume();
        myTV.decreaseVolume();
        assertEquals(0, myTV.getVolume());
    }

    @Test
    public void decreaseVolumeBelowZero_volumeCannotGoBelowZeroTest() {
        myTV.toggle();
        for (int volume = 100; volume > 0; volume--) {
            myTV.decreaseVolume();
        }
        assertEquals(0, myTV.getVolume());
    }

    @Test
    public void changeChannel_changeUpwardTest() {
        myTV.toggle();
        myTV.changeChannelUp();
        assertEquals(1, myTV.getChannel());

    }

//    @Test
//    public void changeChannel

    @Test
    public void changeChannel_changeDownwardTest() {
        myTV.toggle();
        myTV.changeChannelUp();
        myTV.changeChannelDown();
        assertEquals(0, myTV.getChannel());

    }

}