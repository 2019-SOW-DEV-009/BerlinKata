package com.kata.berlin.digitaltime;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class HourTest {
    @Test
    public void shouldReturnHourAs0WhenInitiatedWith0() {
        assertDigitalHourFor(0, 0);
    }

    @Test
    public void shouldReturnHourAs1WhenInitiatedWith1() {
        assertDigitalHourFor(1, 1);
    }

    @Test(expected = InvalidDigitalHourException.class)
    public void shouldThrowInvalidDigitalHourExceptionWhenHourIsInNegative() throws InvalidDigitalHourException {
        new Hour(-1);
    }

    @Test(expected = InvalidDigitalHourException.class)
    public void shouldThrowInvalidDigitalHourExceptionWhenHourIsMorethan23() throws InvalidDigitalHourException {
        new Hour(24);
    }

    @Test
    public void shouldReturnTrueWhenTwoHoursAreEqual() throws InvalidDigitalHourException {
        Hour hourOne = new Hour(23);
        Hour hourTwo = new Hour(23);

        assertEquals(hourOne, hourTwo);
    }

    private void assertDigitalHourFor(int hour1, int expectedHour) {
        Hour digitalHour = null;
        try {
            digitalHour = new Hour(hour1);
        } catch (InvalidDigitalHourException e) {
            fail();
        }

        int hour = digitalHour.hour();

        assertEquals(expectedHour, hour);
    }
}