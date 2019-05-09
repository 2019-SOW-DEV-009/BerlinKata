package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalSecond;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BerlinSecondTest {
    @Test
    public void shouldReturnSecondsAsYWhenInitiatedWith0DigitialSeconds() {
        assertBerlinSecondsFor(0, "Y");
    }

    @Test
    public void shouldReturnSecondsAsOWhenSecondsIs1() {
        assertBerlinSecondsFor(1, "O");
    }

    @Test
    public void shouldReturnSecondsAsYWhenSecondsIs3() {
        assertBerlinSecondsFor(3, "O");
    }

    private void assertBerlinSecondsFor(int digitalSeconds, String expected) {
        DigitalSecond digitalSecond = new DigitalSecond(digitalSeconds);
        BerlinSecond berlinSecond = new BerlinSecond(digitalSecond);

        String seconds = berlinSecond.seconds();

        assertEquals(expected, seconds);
    }
}
