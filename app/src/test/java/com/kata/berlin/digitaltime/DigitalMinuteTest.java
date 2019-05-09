package com.kata.berlin.digitaltime;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitalMinuteTest {
    @Test
    public void shouldReturnMinuteAs1WhenInitiatedWith1() throws InvalidDigitalMinuteException {
        DigitalMinute digitalMinute = new DigitalMinute(1);

        assertEquals(1, digitalMinute.minute());
    }

    @Test(expected = InvalidDigitalMinuteException.class)
    public void shouldThrowInvalidDigitalMinuteExceptionWhenMinuteIsNegative() throws InvalidDigitalMinuteException {
        new DigitalMinute(-1);
    }
}