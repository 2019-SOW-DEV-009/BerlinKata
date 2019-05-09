package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalMinute;
import com.kata.berlin.digitaltime.InvalidDigitalMinuteException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BerlinFiveMinuteTest {
    @Test
    public void shouldReturnFiveMinuteAs11_O_WhenDigitalMinuteIs0() throws InvalidDigitalMinuteException {
        assertBerlinFiveMinuteFor(0, "OOOOOOOOOOO");
    }

    @Test
    public void shouldReturnFiveMinuteAs11_O_WhenDigitalMinuteIsLessThan5() throws InvalidDigitalMinuteException {
        assertBerlinFiveMinuteFor(4, "OOOOOOOOOOO");
    }

    private void assertBerlinFiveMinuteFor(int minute, String expectedFiveMinute) throws InvalidDigitalMinuteException {
        DigitalMinute digitalTime = new DigitalMinute(minute);
        BerlinFiveMinute berlinFiveMinute = new BerlinFiveMinute(digitalTime);

        String fiveMinute = berlinFiveMinute.fiveMinute();

        assertEquals(expectedFiveMinute, fiveMinute);
    }
}
