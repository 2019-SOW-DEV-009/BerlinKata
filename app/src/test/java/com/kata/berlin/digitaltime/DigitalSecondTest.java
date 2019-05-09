package com.kata.berlin.digitaltime;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitalSecondTest {
    @Test(expected = InvalidDigitalSecondsException.class)
    public void shouldThrowInvalidDigitalSecondsExceptionWhenSecondIsNegative() throws InvalidDigitalSecondsException {
        new DigitalSecond(-1);
    }

    @Test(expected = InvalidDigitalSecondsException.class)
    public void shouldThrowInvalidDigitalSecondsExceptionWhenSecondIsMoreThan59() throws InvalidDigitalSecondsException {
        new DigitalSecond(60);
    }

    @Test
    public void shouldReturnTrueWhenTwoDigitalSecondsAreEqual() throws InvalidDigitalSecondsException {
        DigitalSecond secondsOne = new DigitalSecond(36);
        DigitalSecond secondsTwo = new DigitalSecond(36);

        assertEquals(secondsOne, secondsTwo);
    }
}
