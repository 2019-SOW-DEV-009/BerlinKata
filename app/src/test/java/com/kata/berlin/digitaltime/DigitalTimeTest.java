package com.kata.berlin.digitaltime;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitalTimeTest {

    @Test
    public void shouldReturnDigitalSecondsAs25When_00_00_25_IsGiven() {
        DigitalTime digitalTime = new DigitalTime("00:00:25");
        DigitalSecond digitalSecond = digitalTime.second();

        int seconds = digitalSecond.seconds();

        assertEquals(25, seconds);
    }
}