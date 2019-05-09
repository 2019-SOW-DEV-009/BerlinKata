package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalSecond;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BerlinSecondTest {
    @Test
    public void shouldReturnSecondsAsYWhenInitiatedWith0DigitialSeconds() {
        DigitalSecond digitalSecond = new DigitalSecond(0);
        BerlinSecond berlinSecond = new BerlinSecond(digitalSecond);

        String seconds = berlinSecond.seconds();

        assertEquals("Y", seconds);
    }
}
