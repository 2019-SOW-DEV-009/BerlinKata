package com.kata.berlin.digitaltime;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitalHourTest {
    @Test
    public void shouldReturnHourAs0WhenInitiatedWith0() {
        DigitalHour digitalHour = new DigitalHour(0);

        int hour = digitalHour.hour();

        assertEquals(0, hour);
    }
}