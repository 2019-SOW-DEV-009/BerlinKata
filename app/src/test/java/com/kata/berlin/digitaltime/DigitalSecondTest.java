package com.kata.berlin.digitaltime;

import org.junit.Test;

public class DigitalSecondTest {
    @Test(expected = InvalidDigitalSecondsException.class)
    public void shouldThrowInvalidDigitalSecondsExceptionWhenSecondIsNegative() throws InvalidDigitalSecondsException {
        new DigitalSecond(-1);
    }
}
