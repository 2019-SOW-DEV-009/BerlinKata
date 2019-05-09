package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalHour;
import com.kata.berlin.digitaltime.InvalidDigitalHourException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SingleHourTest {
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

    @Test
    public void shouldReturnSingleHourAsRRRRWhenHourIs4() {
        assertSingleHourFor(4, "RRRR");
    }

    @Test
    public void shouldReturnSingleHourAsOOOOWhenHourIs5() {
        assertSingleHourFor(5, "OOOO");
    }

    private void assertSingleHourFor(int hour, String expectedSingleHour) {
        DigitalHour digitalHour = null;
        try {
            digitalHour = new DigitalHour(hour);
        } catch (InvalidDigitalHourException e) {
            fail();
        }
        SingleHour berlinSingleHour = new SingleHour(digitalHour);

        String singleHour = berlinSingleHour.singleHour();

        assertEquals(expectedSingleHour, singleHour);
    }
}
