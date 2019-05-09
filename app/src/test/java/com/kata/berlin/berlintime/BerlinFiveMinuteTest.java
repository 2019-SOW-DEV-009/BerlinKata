package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalMinute;
import com.kata.berlin.digitaltime.InvalidDigitalMinuteException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BerlinFiveMinuteTest {
    @Test
    public void shouldReturnFiveMinuteAs11_O_WhenDigitalMinuteIs0() throws InvalidDigitalMinuteException {
        DigitalMinute digitalTime = new DigitalMinute(0);
        BerlinFiveMinute berlinFiveMinute = new BerlinFiveMinute(digitalTime);

        String fiveMinute = berlinFiveMinute.fiveMinute();

        assertEquals("OOOOOOOOOOO", fiveMinute);
    }
}
