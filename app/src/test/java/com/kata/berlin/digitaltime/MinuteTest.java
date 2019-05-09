package com.kata.berlin.digitaltime;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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

    @Test
    public void shouldReturnTwoMinutesAreEqualWhenMinutesAreSame() throws InvalidDigitalMinuteException {
        Minute minuteOne = new Minute(23);
        Minute minuteTwo = new Minute(23);

        assertEquals(minuteOne, minuteTwo);
    }

    @Test
    public void shouldReturnTwoMinutesAreNotEqualWhenMinutesAreDifferent() throws InvalidDigitalMinuteException {
        Minute minuteOne = new Minute(23);
        Minute minuteTwo = new Minute(26);

        assertNotEquals(minuteOne, minuteTwo);
    }
}