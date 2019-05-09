package com.kata.berlin.digitaltime;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitalMinuteTest {
    @Test
    public void shouldReturnMinuteAs1WhenInitiatedWith1() {
        DigitalMinute digitalMinute = new DigitalMinute(1);

        assertEquals(1, digitalMinute.minute());
    }
}