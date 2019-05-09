package com.kata.berlin.digitaltime;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitalTimeTest {

    @Test
    public void shouldReturnDigitalSecondsAs25When_00_00_25_IsGiven() throws InvalidDigitalTimeException {
        DigitalTime digitalTime = new DigitalTime("00:00:25");
        DigitalSecond digitalSecond = digitalTime.second();

        int seconds = digitalSecond.seconds();

        assertEquals(25, seconds);
    }

    @Test(expected = InvalidDigitalTimeException.class)
    public void shouldThrowInvalidDigitalTimeExceptionWhenTimeIsNull() throws InvalidDigitalTimeException {
        new DigitalTime(null);
    }

    @Test(expected = InvalidDigitalTimeException.class)
    public void shouldThrowInvalidDigitalTimeExceptionWhenTimeLengthNot8() throws InvalidDigitalTimeException {
        new DigitalTime("00:00:1");
    }

    @Test(expected = InvalidDigitalTimeException.class)
    public void shouldThrowInvalidDigitalTimeExceptionWhenTimeContainsAlphabets() throws InvalidDigitalTimeException {
        new DigitalTime("00:aa:00");
    }
}