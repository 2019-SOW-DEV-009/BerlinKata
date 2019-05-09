package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalHour;
import com.kata.berlin.digitaltime.InvalidDigitalHourException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BerlinSingleHourTest {
    @Test
    public void shouldReturnSingleHourAsOOOOWhenInitiatedWith0Hour() {
        assertSingleHourFor(0, "OOOO");
    }

    @Test
    public void shouldReturnSingleHourAsROOOWhenInitiatedWith1Hour() {
        assertSingleHourFor(1, "ROOO");
    }

    @Test
    public void shouldReturnSingleHourAsRROOWhenHourIs2() {
        assertSingleHourFor(2, "RROO");
    }

    @Test
    public void shouldReturnSingleHourAsRRROWhenHourIs3() {
        assertSingleHourFor(3, "RRRO");
    }

    private void assertSingleHourFor(int hour, String expectedSingleHour) {
        DigitalHour digitalHour = null;
        try {
            digitalHour = new DigitalHour(hour);
        } catch (InvalidDigitalHourException e) {
            fail();
        }
        BerlinSingleHour berlinSingleHour = new BerlinSingleHour(digitalHour);

        String singleHour = berlinSingleHour.singleHour();

        assertEquals(expectedSingleHour, singleHour);
    }
}
