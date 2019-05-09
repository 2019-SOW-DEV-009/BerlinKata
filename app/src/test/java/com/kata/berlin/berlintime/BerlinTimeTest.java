package com.kata.berlin.berlintime;

import com.kata.berlin.digitaltime.DigitalTime;
import com.kata.berlin.digitaltime.InvalidDigitalTimeException;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BerlinTimeTest {
    @Test
    @Ignore
    public void shouldReturnBerlinTimeAsYOOOOOOOOOOOOOOOOOOOOOOOWhenDigitalTimeIsAllO() throws InvalidDigitalTimeException {
        DigitalTime digitalTime = new DigitalTime("00:00:00");
        BerlinTime berlinTime = new BerlinTime(digitalTime);

        String time = berlinTime.time();

        assertEquals("YOOOOOOOOOOOOOOOOOOOOOOO", time);
    }
}
