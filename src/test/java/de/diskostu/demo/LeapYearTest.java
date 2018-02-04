package de.diskostu.demo;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearTest {

    @Test
    public void testIsNoLeapYear() {
        final Integer[] years = {1700, 1800, 1900, 1901};
        for (final Integer year : years) {
            Assert.assertFalse(LeapYearCalc.getInstance().isLeapYear(year));
        }
    }

    @Test
    public void testIsLeapYear() {
        final Integer[] years = {1600, 2000, 2004};
        for (final Integer year : years) {
            Assert.assertTrue(LeapYearCalc.getInstance().isLeapYear(year));
        }
    }
}