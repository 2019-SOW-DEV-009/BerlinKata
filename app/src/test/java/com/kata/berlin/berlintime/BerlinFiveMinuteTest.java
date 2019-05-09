package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalMinute;
import com.kata.berlin.digitaltime.InvalidDigitalMinuteException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BerlinFiveMinuteTest {
    @Test
    public void shouldReturnFiveMinuteAs11_O_WhenDigitalMinuteIs0() {
        assertBerlinFiveMinuteFor(0, "OOOOOOOOOOO");
    }

    @Test
    public void shouldReturnFiveMinuteAs11_O_WhenDigitalMinuteIsLessThan5() {
        assertBerlinFiveMinuteFor(4, "OOOOOOOOOOO");
    }

    @Test
    public void shouldReturnFiveMinuteAs_Y_And_10_O_WhenDigitalMinuteIs5() {
        assertBerlinFiveMinuteFor(5, "YOOOOOOOOOO");
    }

    private void assertBerlinFiveMinuteFor(int minute, String expectedFiveMinute) {
        DigitalMinute digitalTime = null;
        try {
            digitalTime = new DigitalMinute(minute);
        } catch (InvalidDigitalMinuteException e) {
            fail();
        }
        BerlinFiveMinute berlinFiveMinute = new BerlinFiveMinute(digitalTime);

        String fiveMinute = berlinFiveMinute.fiveMinute();

        assertEquals(expectedFiveMinute, fiveMinute);
    }
}
