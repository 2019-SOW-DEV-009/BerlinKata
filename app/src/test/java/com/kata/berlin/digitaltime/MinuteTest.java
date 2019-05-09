package com.kata.berlin.digitaltime;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinuteTest {
    @Test
    public void shouldReturnMinuteAs1WhenInitiatedWith1() throws InvalidDigitalMinuteException {
        Minute minute = new Minute(1);

        assertEquals(1, minute.minute());
    }

    @Test(expected = InvalidDigitalMinuteException.class)
    public void shouldThrowInvalidDigitalMinuteExceptionWhenMinuteIsNegative() throws InvalidDigitalMinuteException {
        new Minute(-1);
    }

    @Test(expected = InvalidDigitalMinuteException.class)
    public void shouldThrowInvalidDigitalMinuteExceptionWhenMinuteIsMoreThan59() throws InvalidDigitalMinuteException {
        new Minute(60);
    }
}