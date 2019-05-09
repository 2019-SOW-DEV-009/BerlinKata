package com.kata.berlin.digitaltime;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class DigitalHourTest {
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
        new DigitalHour(-1);
    }

    @Test(expected = InvalidDigitalHourException.class)
    public void shouldThrowInvalidDigitalHourExceptionWhenHourIsMorethan23() throws InvalidDigitalHourException {
        new DigitalHour(24);
    }

    private void assertDigitalHourFor(int hour1, int expectedHour) {
        DigitalHour digitalHour = null;
        try {
            digitalHour = new DigitalHour(hour1);
        } catch (InvalidDigitalHourException e) {
            fail();
        }

        int hour = digitalHour.hour();

        assertEquals(expectedHour, hour);
    }
}