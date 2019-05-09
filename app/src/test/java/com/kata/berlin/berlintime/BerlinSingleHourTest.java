package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalHour;
import com.kata.berlin.digitaltime.InvalidDigitalHourException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BerlinSingleHourTest {
    @Test
    public void shouldReturnSingleHourAsOOOOWhenInitiatedWith0Hour() throws InvalidDigitalHourException {
        assertSingleHourFor(0, "OOOO");
    }

    @Test
    public void shouldReturnSingleHourAsROOOWhenInitiatedWith1Hour() throws InvalidDigitalHourException {
        assertSingleHourFor(1, "ROOO");
    }

    @Test
    public void shouldReturnSingleHourAsRROOWhenHourIs2() throws InvalidDigitalHourException {
        assertSingleHourFor(2, "RROO");
    }

    private void assertSingleHourFor(int hour, String expectedSingleHour) throws InvalidDigitalHourException {
        DigitalHour digitalHour = new DigitalHour(hour);
        BerlinSingleHour berlinSingleHour = new BerlinSingleHour(digitalHour);

        String singleHour = berlinSingleHour.singleHour();

        assertEquals(expectedSingleHour, singleHour);
    }
}
