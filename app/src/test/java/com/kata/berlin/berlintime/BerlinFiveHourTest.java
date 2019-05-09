package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalHour;
import com.kata.berlin.digitaltime.InvalidDigitalHourException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BerlinFiveHourTest {
    @Test
    public void shouldReturnFiveHourAsOOOOWhenDigitalHourIsLessThen5() throws InvalidDigitalHourException {
        DigitalHour digitalHour = new DigitalHour(4);
        BerlinFiveHour berlinFiveHour = new BerlinFiveHour(digitalHour);

        String fiveHour = berlinFiveHour.fiveHour();

        assertEquals("OOOO", fiveHour);
    }
}
