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
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        }

        return false;
    }
}