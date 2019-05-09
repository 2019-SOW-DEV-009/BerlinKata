package com.kata.berlin.digitaltime;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitalHourTest {
    @Test
    public void shouldReturnHourAs0WhenInitiatedWith0() {
        assertDigitalHourFor(0, 0);
    }

    @Test
    public void shouldReturnHourAs1WhenInitiatedWith1() {
        assertDigitalHourFor(1, 1);
    }

    private void assertDigitalHourFor(int hour1, int expectedHour) {
        DigitalHour digitalHour = new DigitalHour(hour1);

        int hour = digitalHour.hour();

        assertEquals(expectedHour, hour);
    }
}