package menstrualCycleApp;

import java.time.LocalDate;

public class MenstrualCycleTracker {
    private String name;
    private int cycleLength;
    private LocalDate lastPeriodDate;
    private String day;
    private String month;
    private String year;



    public MenstrualCycleTracker() {

    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCycleLength(int cycleLength) {
        this.cycleLength = cycleLength;
    }
    public void setLastPeriodDate(String year, String month, String day) {
        LocalDate lastPeriodDate = LocalDate.parse(fetchDate(year,month,day));
        this.lastPeriodDate = lastPeriodDate;
    }
    private String fetchDate(String year, String month, String day) {
        return year + "-" + month + "-" + day;
    }
    public void setDay(String day) {
        this.day = day;
    }
    public void setMonth(String month) {
        this.month = month;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public int getCycleLength() {
        return cycleLength;
    }
    public LocalDate getLastPeriodDate() {
        return lastPeriodDate;
    }
    public LocalDate getNextPeriodDate(int cycleLength) {
        this.cycleLength = cycleLength;
        int cycle = getCycleLength();
        return lastPeriodDate.plusDays(cycle);
    }
    public String getDay() {
        return day;
    }
    public String getMonth() {
        return month;
    }
    public String getYear() {
        return year;
    }
}
