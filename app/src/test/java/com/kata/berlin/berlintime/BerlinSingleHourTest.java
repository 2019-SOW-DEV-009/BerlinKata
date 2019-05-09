package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalHour;
import com.kata.berlin.digitaltime.InvalidDigitalHourException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BerlinSingleHourTest {
    @Test
    public void shouldReturnSingleHourAsOOOOWhenInitiatedWith0Hour() throws InvalidDigitalHourException {
        DigitalHour digitalHour = new DigitalHour(0);
        BerlinSingleHour berlinSingleHour = new BerlinSingleHour(digitalHour);

        String singleHour = berlinSingleHour.singleHour();

        assertEquals("OOOO", singleHour);
    }

    @Test
    public void shouldReturnSingleHourAsROOOWhenInitiatedWith1Hour() throws InvalidDigitalHourException {
        DigitalHour digitalHour = new DigitalHour(1);
        BerlinSingleHour berlinSingleHour = new BerlinSingleHour(digitalHour);

        String singleHour = berlinSingleHour.singleHour();

        assertEquals("ROOO", singleHour);
    }
}
