package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalHour;
import com.kata.berlin.digitaltime.InvalidDigitalHourException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BerlinFiveHourTest {
    @Test
    public void shouldReturnFiveHourAsOOOOWhenDigitalHourIsLessThen5() {
        assertBerlinFiveHourFor(4, "OOOO");
    }

    @Test
    public void shouldReturnFiveHourAsROOOWhenDigitalHourIs5() {
        assertBerlinFiveHourFor(5, "ROOO");
    }

    @Test
    public void shouldReturnFiveHourAsRROOWhenDigitalHourIs10() {
        assertBerlinFiveHourFor(10, "RROO");
    }

    private void assertBerlinFiveHourFor(int hour, String expectedFiveHour) {
        DigitalHour digitalHour = null;
        try {
            digitalHour = new DigitalHour(hour);
        } catch (InvalidDigitalHourException e) {
            fail();
        }
        BerlinFiveHour berlinFiveHour = new BerlinFiveHour(digitalHour);

        String fiveHour = berlinFiveHour.fiveHour();

        assertEquals(expectedFiveHour, fiveHour);
    }
}
