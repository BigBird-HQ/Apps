package menstrualApp;

import menstrualCycleApp.MenstrualCycleTracker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MenstrualCycleTrackerTest {
@Test
    public void testUserName(){
    MenstrualCycleTracker cycleTracker = new MenstrualCycleTracker();
    cycleTracker.setName("Didi");
    assertEquals("Didi",cycleTracker.getName());
}
@Test
    public void testForCycleLength() {
    MenstrualCycleTracker cycleTracker = new MenstrualCycleTracker();
    cycleTracker.setCycleLength(23);
    assertEquals(23, cycleTracker.getCycleLength());
}
@Test
    public void testDay() {
    MenstrualCycleTracker cycleTracker = new MenstrualCycleTracker();
    cycleTracker.setDay("05");
    assertEquals("05", cycleTracker.getDay());
}
@Test
    public void testMonth() {
    MenstrualCycleTracker cycleTracker = new MenstrualCycleTracker();
    cycleTracker.setMonth("01");
    assertEquals("01", cycleTracker.getMonth());
}
@Test
    public void testYear() {
    MenstrualCycleTracker cycleTracker = new MenstrualCycleTracker();
    cycleTracker.setYear("2024");
    assertEquals("2024", cycleTracker.getYear());
}
@Test
    public void testForLastPeriodDate() {
    MenstrualCycleTracker cycleTracker = new MenstrualCycleTracker();
    cycleTracker.setLastPeriodDate("2024", "01","05");
    String lastPeriod = String.valueOf(cycleTracker.getLastPeriodDate());
    assertEquals("2024-01-05",lastPeriod);
}
    @Test
    public void testForNextPeriodDate() {
        MenstrualCycleTracker cycleTracker = new MenstrualCycleTracker();
        cycleTracker.setLastPeriodDate("2024", "01","05");
        String lastPeriod = String.valueOf(cycleTracker.getLastPeriodDate());
        assertEquals("2024-01-05", lastPeriod);
        String lastDate = String.valueOf(cycleTracker.getNextPeriodDate(23));
        assertEquals("2024-01-28", lastDate);
    }
}