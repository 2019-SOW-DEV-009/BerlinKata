package com.kata.berlin.digitaltime;

import org.junit.Test;

public class DigitalSecondTest {
    @Test(expected = InvalidDigitalSecondsException.class)
    public void shouldThrowInvalidDigitalSecondsExceptionWhenSecondIsNegative() throws InvalidDigitalSecondsException {
        new DigitalSecond(-1);
    }

    @Test(expected = InvalidDigitalSecondsException.class)
    public void shouldThrowInvalidDigitalSecondsExceptionWhenSecondIsMoreThan59() throws InvalidDigitalSecondsException {
        new DigitalSecond(60);
    }
}
