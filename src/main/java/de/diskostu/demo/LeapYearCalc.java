package de.diskostu.demo;

public class LeapYearCalc {

    private static LeapYearCalc instance;

    public static LeapYearCalc getInstance() {
        if (instance == null) {
            instance = new LeapYearCalc();
        }
        return instance;
    }

    public boolean isLeapYear(final Integer year) {
        return false;
    }
}