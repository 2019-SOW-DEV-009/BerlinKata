package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalSecond;
import com.kata.berlin.digitaltime.InvalidDigitalSecondsException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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

    @Test
    public void shouldReturnTrueWhenTwoBerlinSecondsAreEqual() throws InvalidDigitalSecondsException {
        assertEquals(createBerlinSecondWith(45), createBerlinSecondWith(45));
    }

    private BerlinSecond createBerlinSecondWith(int seconds) throws InvalidDigitalSecondsException {
        DigitalSecond digitalSecondOne = new DigitalSecond(seconds);
        return new BerlinSecond(digitalSecondOne);
    }

    private void assertBerlinSecondsFor(int digitalSeconds, String expected) {
        DigitalSecond digitalSecond = null;
        try {
            digitalSecond = new DigitalSecond(digitalSeconds);
        } catch (InvalidDigitalSecondsException e) {
            fail();
        }
        BerlinSecond berlinSecond = new BerlinSecond(digitalSecond);

        String seconds = berlinSecond.seconds();

        assertEquals(expected, seconds);
    }
}
